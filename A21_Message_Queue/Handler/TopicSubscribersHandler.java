package A21_Message_Queue.Handler;

import A21_Message_Queue.Model.Topic;
import A21_Message_Queue.Model.TopicSubscriber;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Note: Each topic will have its own handlers
public class TopicSubscribersHandler {
    private Topic topic;
    private Map<String, SubscriberWorker> subscriberWorkers;

    public TopicSubscribersHandler(Topic topic){
        this.topic = topic;
        subscriberWorkers = new HashMap<>();
    }

    public void publish(){
        List<TopicSubscriber> subscriberList = topic.getSubscribers();
        for(TopicSubscriber topicSubscriber: subscriberList){
            startSubscriberWorker(topicSubscriber);
        }
    }

    public void startSubscriberWorker(TopicSubscriber topicSubscriber){
        String subscriberId = topicSubscriber.getSubscriber().getId();

        //create subscriber worker if already does not exists - this is for lazy loading
        if(!subscriberWorkers.containsKey(subscriberId)){
            SubscriberWorker worker = new SubscriberWorker(topic, topicSubscriber);
            subscriberWorkers.put(subscriberId, worker);
            Thread workerThread  = new Thread(worker);
            workerThread.start();
        }

        //wakeup subscriber
        SubscriberWorker worker = subscriberWorkers.get(subscriberId);
        worker.wakeUpIfNeeded();
    }
}
