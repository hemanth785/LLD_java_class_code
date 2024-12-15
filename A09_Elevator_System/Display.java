package A09_Elevator_System;

public class Display {
  
}

class HallDispaly(){
  private int floor;
  private Direction direction;

  public void showHallDisplay();
}

class ElevatorCarDispaly(){
  private int floor;
  private int capacity;
  private Direction direction;

  public void showElevatorDisplay();
  public void showHallDisplay();
}
