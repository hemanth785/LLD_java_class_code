package A21_Message_Queue.Public_Interface;

import A21_Message_Queue.Model.Message;

public interface ISubscriber {
    String getId();
    void consume(Message message);
}
