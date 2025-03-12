package A21_Message_Queue.Model;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private String topicId;
    private String topicName;
    private List<Message> messages;
    private List<TopicSubscriber> subscribers;

    //Constructor
    public Topic(String topicName, String topicId){
        this.topicId = topicId;
        this.topicName = topicName;
        messages = new ArrayList<>();
        subscribers = new ArrayList<>();
    }

    public void addMessage(Message message){
        messages.add(message);
    }

    public void addSubscriber(TopicSubscriber subscriber){
        subscribers.add(subscriber);
    }

    public String getTopicId(){
        return topicId;
    }

    public String getTopicName(){
        return topicName;
    }

    public List<Message> getMessages(){
        return messages;
    }

    public List<TopicSubscriber> getSubscribers(){
        /* TODO: we need to pass the immutable list of subscribers, since this list should not be editable */
        return subscribers;
    }

}
