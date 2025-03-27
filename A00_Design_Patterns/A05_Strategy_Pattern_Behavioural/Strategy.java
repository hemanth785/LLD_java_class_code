package A00_Design_Patterns.A05_Strategy_Pattern_Behavioural;

public class Strategy {
  
}

/* Strategies */

// 1. Strategy interface
interface PaymentStrategy {
  abstract void collectPaymentDetails();
  abstract void pay(int amount);
}


// 2. Concrete strategy classes
class CreditCardPaymentStrategy implements PaymentStrategy {
  CreditCard card;

  public void collectPaymentDetails(){
    card = new CreditCard(24343423, "12/4/2024", 567);
  }

  public void pay(int amount){
    System.out.println("Paying "+amount+" through credit card");
    card.deductAmout(amount);
  }
}

class PayPalPaymentStrategy implements PaymentStrategy {
  String email;
  String password;

  public void collectPaymentDetails(){
    email = "hemanth@gmail.com";
    password = "*********";
  }

  public void pay(int amount){
    System.out.println("Paying "+amount+" through PayPal");
  }
}

/* Context class */
class PaymentProcessor {
  private PaymentStrategy strategy;

  // constructor
  public PaymentProcessor(PaymentStrategy strategy){
    this.strategy = strategy;
  }

  //Business code
  public void processPayment(int amount){
    strategy.collectPaymentDetails();
    strategy.pay(amount);
  }

  //setter
  void setStrategy(PaymentStrategy strategy) {
    this.strategy = strategy;
  }
}




/* helper class */

class CreditCard {
  private int cardNumber;
  private String expiryDate;
  private int cvv;
  private int creditAvailable;

  public CreditCard(int cardNumber, String expiryDate, int cvv){
    this.cardNumber = cardNumber;
    this.expiryDate = expiryDate;
    this.cvv = cvv;
  }

  public void deductAmout(int amount){
    creditAvailable = creditAvailable - amount;
  }
}