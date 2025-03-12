package A21_Message_Queue.Model;

public class Message {
    // The reason we have separate message class,
    // because in real world message contains multiple metadata associated with it as well.
    private final String msg;

    public Message(String msg){
        this.msg = msg;
    }

    public String getMessage(){
        return msg;
    }
}
