package Library_management;

import Library_management.BookReservation_Lending_Fine.BookLending;
import Library_management.BookReservation_Lending_Fine.BookReservation;

public class Notification {
  // User is an abstract class
  public abstract class Notification {
    Private String notificationId;
    Private Date creationDate;
    Private String content;
    private BookLending bookLending;
    private BookReservation bookReservation;

    public abstract boolean sendNotification();
  }

  public class PostalNotification extends Notification {
    private Address address;

    public boolean sendNotification(){
        // definition
    }
  }

  public class EmailNotification extends Notification {
    private String email;

    public boolean sendNotification(){
        // definition
    }
  }
}
