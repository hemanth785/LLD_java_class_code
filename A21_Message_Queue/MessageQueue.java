package A21_Message_Queue;

import A21_Message_Queue.Handler.TopicSubscribersHandler;
import A21_Message_Queue.Model.Message;
import A21_Message_Queue.Model.Topic;
import A21_Message_Queue.Model.TopicSubscriber;
import A21_Message_Queue.Public_Interface.ISubscriber;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MessageQueue {
    private Map<String, TopicSubscribersHandler> topicHandlers;

    MessageQueue(){
        topicHandlers = new HashMap<>();
    }

    public Topic createTopic(String topicName){
        Topic topic = new Topic(topicName, UUID.randomUUID().toString());
        TopicSubscribersHandler topicHandler = new TopicSubscribersHandler(topic);
        topicHandlers.put(topic.getTopicId(), topicHandler);
        System.out.println("Created topic: "+ topicName);

        return topic;
    }

    public void subscribe(ISubscriber subscriber, Topic topic){
        topic.addSubscriber(new TopicSubscriber(subscriber));
        System.out.println(subscriber.getId() + " subscribed to topic: " + topic.getTopicName());
    }

    public void publish(Topic topic, Message message){
        topic.addMessage(message);
        System.out.println(message.getMessage()+" published to topic: "+ topic.getTopicName());

        Thread processorThread = new Thread(() -> {
            TopicSubscribersHandler subscribersHandler = topicHandlers.get(topic.getTopicId());
            subscribersHandler.publish();
        });
        processorThread.start();
    }

    public void resetOffset(Topic topic, ISubscriber subscriber, Integer newOffset) {
        for (TopicSubscriber topicSubscriber : topic.getSubscribers()) {
            if (topicSubscriber.getSubscriber().equals(subscriber)) {
                topicSubscriber.getOffset().set(newOffset);
                System.out.println(topicSubscriber.getSubscriber().getId() + " offset reset to: " + newOffset);
                new Thread(() -> topicHandlers.get(topic.getTopicId()).startSubscriberWorker(topicSubscriber)).start();
                break;
            }
        }
    }
}
