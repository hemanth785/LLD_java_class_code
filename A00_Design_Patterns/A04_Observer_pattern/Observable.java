package A05_Observer_pattern;

import java.util.ArrayList;
import java.util.List;

import A05_Observer_pattern.Observer.NotificationAlertOberver;

public class Observable {
  // Interface
  public interface I_Observable {
    public void addObserver(NotificationAlertOberver observer);
    
    public void removeOverver(NotificationAlertOberver observer);

    public void notifySubscribers();

    public void updateStockCount(int newStockAdded);

    public int getStockCount();
  }


  // Concrete observable class
  public static class AndroidObservable implements I_Observable {
    private List<NotificationAlertOberver> subscriberList = new ArrayList<>();
    private int stockCount = 0;

    // Constructor
    public AndroidObservable(){ }

    public void addObserver(NotificationAlertOberver observer){
      subscriberList.add(observer);
    }

    public void removeOverver(NotificationAlertOberver observer){
      subscriberList.remove(observer);
    }

    public void notifySubscribers(){
      for(NotificationAlertOberver observer: subscriberList){
        observer.update();
      }
    }

    public void updateStockCount(int newStockAdded){
      if(stockCount == 0){ //if old stock was empty, then notify subscriber/observer
        notifySubscribers();
      }

      stockCount = stockCount + newStockAdded;
    }

    public int getStockCount(){
      return stockCount;
    }

  }
}
