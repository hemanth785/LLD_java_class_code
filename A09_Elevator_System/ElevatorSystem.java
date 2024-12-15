package A09_Elevator_System;

import java.util.List;

public class ElevatorSystem {
  private List<ElevatorCar> elevatorCars;  
  private DispatchStrategy strategy;

  public void monitoring(){

  }
  public void requestCar(){
    
  }
  public ElevatorCar selectBestElevatorCar(){

  }
  public void dispatchCar(){
    
  }

  // Private constructor to prevent direct instantiation
  private ElevatorSystem() {
      // Initialize the ElevatorSystem
  }
  
  // The ElevarSystem is a singleton class that ensures it will have only one active instance at a time
  private static ElevatorSystem system = null;
  
  // Created a static method to access the singleton instance of ElevatorSytem class
  public static ElevatorSystem getInstance() {
      if (system == null) {
          system = new ElevatorSystem();
      }
      return system;
  }
}


abstract class DispatchStrategy{
    public abstract void dispatchCar(HallButton button);
}

class FCFS_Strategy extends DispatchStrategy{
    public void dispatchCar(HallButton button){

    }
}

class SSTF_Strategy extends DispatchStrategy{
    public void dispatchCar(HallButton button){

    }
}

class SCAN_Strategy extends DispatchStrategy{
    public void dispatchCar(HallButton button){

    }
}

class LOOK_Strategy extends DispatchStrategy{
    public void dispatchCar(HallButton button){

    }
}
