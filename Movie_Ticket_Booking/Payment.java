package Movie_Ticket_Booking;

import Movie_Ticket_Booking.Enumerations.PaymentStatus;

public class Payment {
  // Payment is an abstract class
  public abstract class Payment {
    // Data members
    private double amount;

    // The Date datatype represents and deals with both date and time.
    private Date timestamp;
    private PaymentStatus status;

    public abstract boolean makePayment();
  }

  public class Cash extends Payment {
      public boolean makePayment() {
          // functionality
      }
  }

  public class CreditCard extends Payment {
      // Data members
      private String nameOnCard;
      private String cardNumber;
      private String billingAddress;
      private int code;

      public boolean makePayment() {
          // functionality
      }
  }
}
