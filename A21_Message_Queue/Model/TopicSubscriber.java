package A21_Message_Queue.Model;

import A21_Message_Queue.Public_Interface.ISubscriber;
import java.util.concurrent.atomic.AtomicInteger;

public class TopicSubscriber {
    private AtomicInteger offset;
    private ISubscriber subscriber;  //Because the same subscriber might subscribe to multiple topic

    public TopicSubscriber(ISubscriber subscriber){
        this.subscriber = subscriber;
        offset = new AtomicInteger(0);
    }

    public AtomicInteger getOffset(){
        return offset;
    }

    public ISubscriber getSubscriber(){
        return subscriber;
    }
}
