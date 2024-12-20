package A00_Design_Patterns.A04_Observer_pattern;

import A00_Design_Patterns.A04_Observer_pattern.Observable.*;
import A00_Design_Patterns.A04_Observer_pattern.Observer.EmailNotificationObserver;
import A00_Design_Patterns.A04_Observer_pattern.Observer.NotificationAlertOberver;

public class Main {
  public static void main(String[] args) {
    AndroidObservable androidStockObservable = new AndroidObservable();

    NotificationAlertOberver observerObj1 = new EmailNotificationObserver("hemanth@gmail.com", androidStockObservable);
    NotificationAlertOberver observerObj2 = new EmailNotificationObserver("hemanth2@gmail.com", androidStockObservable);
    //Note we can also create different Notification Observer like, push Notification observer also

    androidStockObservable.addObserver(observerObj1);
    androidStockObservable.addObserver(observerObj2);

    androidStockObservable.updateStockCount(10);
  }
  
}
