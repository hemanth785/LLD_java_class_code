package Movie_Ticket_Booking;

public class Notification {
  // Notification is an abstract class
  public abstract class Notification {
    private int notificationId;
    // The Date datatype represents and deals with both date and time.
    private Date createdOn;
    private String content;

    // person here refers to an instance of the Person class 
    public abstract void sendNotification(Person person);
  }

  public class EmailNotification extends Notification {
    // person here refers to an instance of the Person class 
    public void sendNotification(Person person) {
      // functionality 
    }
  }

  public class PhoneNotification extends Notification {
    // person here refers to an instance of the Person class 
    public void sendNotification(Person person) {
      // functionality 
    }
  }
}
