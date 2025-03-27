package A00_Design_Patterns.A04_Observer_pattern;

import A00_Design_Patterns.A04_Observer_pattern.Observable.I_Observable;

public class Observer {
  public interface NotificationAlertOberver {
    public void update();
    
  }

  public static class EmailNotificationObserver implements NotificationAlertOberver {
    private String emailId;
    private I_Observable stockObservable;

    //constructor
    public EmailNotificationObserver(String emailId, I_Observable stockObservable){
      this.emailId = emailId;
      this.stockObservable = stockObservable; //we are saving observable object, so that when stock update comes from observable, we know from which observable to call to get latest stock data
    }

    public void update(){
      int latestStockCount = this.stockObservable.getStockCount();
      sendMail(latestStockCount);
    }

    private void sendMail(int stockCount){
      System.out.println("Mail sent to"+ emailId+" with stock count: "+stockCount);
    }
    
  } 
}
