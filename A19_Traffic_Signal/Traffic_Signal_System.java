package A19_Traffic_Signal;

public class Traffic_Signal_System {
  public static void main(String[] args) {
    TrafficSignal signal = new TrafficSignal(new YellowLight());

    signal.changeState();
    signal.changeState();
    signal.changeState();
    signal.changeState();
  }
}

/* States */
interface TrafficLight {
  abstract void changeLight(TrafficSignal signal);
  abstract void printLight();
}

class GreenLight implements TrafficLight {
  String light = "Green";

  public void changeLight(TrafficSignal signal){
    signal.state = new YellowLight();
  }

  public void printLight(){
    System.out.println("Light change to - "+ this.light);
  }
}

class YellowLight implements TrafficLight {
  String light = "Yellow";

  public void changeLight(TrafficSignal signal){
    signal.state = new RedLight();
  }

  public void printLight(){
    System.out.println("Light change to - "+ this.light);
  }
}

class RedLight implements TrafficLight {
  String light = "Red";

  public void changeLight(TrafficSignal signal){
    signal.state = new GreenLight();
  }

  public void printLight(){
    System.out.println("Light change to - "+ this.light);
  }
}


/*
 * Traffic signal
 */

class TrafficSignal {
  protected TrafficLight state;

  TrafficSignal(TrafficLight state){
    this.state = state;
  }

  public void changeState(){
    state.changeLight(this); //pass 'this' context to state, so that state can update the next state
    this.printState();
  }

  public void printState(){
    this.state.printLight();
  }
}


