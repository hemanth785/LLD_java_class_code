

import java.util.HashMap;
import java.util.Map;

public class LFU_Cache {
  int capacity;
  int minFrequency;
  Map<Integer, Node> cache;
  Map<Integer, DoublyLinkedList> frequencyMap;

  public LFU_Cache(int capacity) {
    this.capacity = capacity;
    minFrequency = 0;

    cache = new HashMap<>();
    frequencyMap = new HashMap<>();
  }
  
  public int get(int key) {
    Node curNode = cache.get(key);
    if (curNode == null) {
        return -1;
    }
    updateNode(curNode);
    return curNode.val;
  }
  
  public void put(int key, int value) {
    //exceptional corner case
    if(this.capacity == 0){
      return;
    }

    if(cache.containsKey(key)){
      Node curNode = cache.get(key);
      curNode.val = value;
      updateNode(curNode);

    } else {
      // New key
      if(cache.size() == capacity){
        // get minimum frequency list, and remove the last node
        DoublyLinkedList minFreqList = frequencyMap.getOrDefault(minFrequency, new DoublyLinkedList());
        cache.remove(minFreqList.tail.prev.key);
        minFreqList.removeNode(minFreqList.tail.prev);
      }
      minFrequency = 1;
      Node newNode = new Node(key, value);

      // get the list with frequency 1, and then add new node into the list, as well as into LFU cache
      DoublyLinkedList curList = frequencyMap.getOrDefault(minFrequency, new DoublyLinkedList());
      curList.addNode(newNode);
      frequencyMap.put(minFrequency, curList);
      cache.put(key, newNode);
    }
    
  }

  // Additional code
  private void updateNode(Node curNode){
    int curFreq = curNode.frequency;
    DoublyLinkedList curList = frequencyMap.get(curFreq);
    curList.removeNode(curNode);

    // if current list is the last list which has lowest frequency and current node is the only node in that list
    // we need to remove the entire list and then increase min frequency value by 1
    if (curFreq == minFrequency && curList.listSize == 0) {
      minFrequency++;
    }

    curNode.frequency++;

    // add current node to another list has current frequency + 1,
    // if we do not have the list with this frequency, initialize it
    DoublyLinkedList newList = frequencyMap.getOrDefault(curNode.frequency, new DoublyLinkedList());
    newList.addNode(curNode);
    frequencyMap.put(curNode.frequency, newList);
  }

  static class Node {
    int key;
    int val;
    int frequency;
    Node prev;
    Node next;

    public Node(int key, int val){
      this.key = key;
      this.val = val;
      this.frequency = 1;
    }
  }

  static class DoublyLinkedList {
    int listSize;
    Node head;
    Node tail;

    DoublyLinkedList(){
      this.listSize = 0;
      this.head = new Node(0, 0);
      this.tail = new Node(0, 0);
      head.next = tail;
      tail.prev = head;
    }

    public void addNode(Node curNode){
      //Add after the add
      Node nextNode = head.next;

      curNode.next = nextNode;
      curNode.prev = head;

      head.next = curNode;
      nextNode.prev = curNode;

      listSize++;
    }

    public void removeNode(Node curNode){
      Node prevNode = curNode.prev;
      Node nextNode = curNode.next;
      prevNode.next = nextNode;
      nextNode.prev = prevNode;

      listSize--;
    }
  }
}
