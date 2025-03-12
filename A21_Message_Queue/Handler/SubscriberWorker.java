package A21_Message_Queue.Handler;

import A21_Message_Queue.Model.Message;
import A21_Message_Queue.Model.Topic;
import A21_Message_Queue.Model.TopicSubscriber;

public class SubscriberWorker implements Runnable {
    private Topic topic;
    private TopicSubscriber topicSubscriber;

    public SubscriberWorker(Topic topic, TopicSubscriber topicSubscriber){
        this.topic = topic;
        this.topicSubscriber = topicSubscriber;
    }

    public void run(){
        synchronized (topicSubscriber){
            do {
                try {
                    int curOffset = topicSubscriber.getOffset().get();
                    while(curOffset >= topic.getMessages().size()){
                        topicSubscriber.wait();
                    }

                    Message message = topic.getMessages().get(curOffset);
                    topicSubscriber.getSubscriber().consume(message);

                    // We cannot just increment here since subscriber offset can be reset while it is consuming. So, after
                    // consuming we need to increase only if it was previous one.
                    topicSubscriber.getOffset().compareAndSet(curOffset, curOffset+1);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } while(true);
        }
    }

    synchronized public void wakeUpIfNeeded(){
        synchronized (topicSubscriber){
            topicSubscriber.notify();
        }
    }

}
