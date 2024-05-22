// Payment is an abstract class
public abstract class Payment {
  private double amount;
  private PaymentStatus status;
  private Date timestamp;

  public abstract boolean initiateTransaction();
}

public class Cash extends Payment {
  public boolean initiateTransaction() {
      // definition
  }
}

public class CreditCard extends Payment {
  public boolean initiateTransaction() {
      // definition
  }
}