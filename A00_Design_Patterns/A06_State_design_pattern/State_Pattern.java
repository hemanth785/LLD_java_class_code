package A00_Design_Patterns.A06_State_design_pattern;

public class State_Pattern {
  public static void main(String[] args) {
    Phone phone = new Phone();

    phone.state.onHomeButtom();
    phone.state.onHomeButtom();

    phone.state.onHomeButtom();
    phone.state.onPowerButtom();
    phone.state.onHomeButtom();
    phone.state.onPowerButtom();
  }
}

// Context class
class Phone {
  public State state;

  public Phone(){
    state = new OffState(this); //this will be the initial state of the phone
  }

  public void setState(State state){
    System.out.println("Phone state changed to: "+state.stateName);
    this.state = state;
  }

  //action methods
  public void lockThePhone(){
    System.out.println("Locking the phone and turning off screen \n");
  } 

  public void unlockThePhone(){
    System.out.println("Unlocking the phone to home screen \n");
  }

  public void gotToHomeScreen(){
    System.out.println("Going to home-screen \n");
  } 

  public void turnOn(){
    System.out.println("Turning screen on, device still locked \n");
  } 
}

/*
 * State classes:
 * - Lets consider teh states transitions for 'home' and 'power' button
 *   when phone is in different states
 * 
 * Device can be 3 states, with respect to above buttons
 * 1. Off state - Screen is off and device is locked
 * 2. Lock State - Screen is on, but devive is locked
 * 3. Unlock state - Screen is on and also device is unlocked
 */

// Abstract state class
abstract class State{
  protected Phone phone;
  protected String stateName;

  public State(Phone phone){
    this.phone = phone;
  }

  public abstract void onHomeButtom();
  public abstract void onPowerButtom();
}

// Concrete state clases
class OffState extends State {
  public OffState(Phone phone){
    super(phone);
    this.stateName = "Off-State";
  }

  public void onHomeButtom(){
    phone.setState(new LockedState(phone)); //changing the state
    phone.turnOn();
  } 
  public void onPowerButtom(){
    phone.setState(new LockedState(phone));
    phone.turnOn();
  } 
}

class LockedState extends State {
  public LockedState(Phone phone){
    super(phone);
    this.stateName = "Locked-State";
  }

  public void onHomeButtom(){
    phone.setState(new UnlockedState(phone));
    phone.unlockThePhone();
  } 
  public void onPowerButtom(){
    phone.setState(new LockedState(phone));
    phone.lockThePhone();
  } 
}


class UnlockedState extends State {
  public UnlockedState(Phone phone){
    super(phone);
    this.stateName = "Unlocked-State";
  }

  public void onHomeButtom(){
    phone.gotToHomeScreen(); //Here state change is not required
  } 
  public void onPowerButtom(){
    phone.setState(new OffState(phone));
    phone.lockThePhone();
  } 
}