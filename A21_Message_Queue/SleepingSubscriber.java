package A21_Message_Queue;

import A21_Message_Queue.Model.Message;
import A21_Message_Queue.Public_Interface.ISubscriber;

public class SleepingSubscriber implements ISubscriber {
    private final String id;
    private final int sleepTimeInMillis;

    public SleepingSubscriber(String id, int sleepTimeInMillis) {
        this.id = id;
        this.sleepTimeInMillis = sleepTimeInMillis;
    }

    public String getId() {
        return id;
    }

    public void consume(Message message) {
        System.out.println("Subscriber: " + id + " started consuming: " + message.getMessage());
        try {
            Thread.sleep(sleepTimeInMillis);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Subscriber: " + id + " done consuming: " + message.getMessage());
    }
}