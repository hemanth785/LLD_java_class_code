package A09_Elevator_System;

// << Abstract >>
public class Button {
  private boolean status;

  public pressDown();
  public abstract boolean isPressed();
}



class DoorButton extends Button {
  public boolean isPressed() {
      // Definition
  }
}

class HallButton extends Button  {
  private Direction buttonSign;

  public boolean isPressed() {
      // definition
  }
}

class ElevatorButton extends Button  {
  private int destinationFloorNumber;

  public boolean isPressed() {
      // definition
  }
}
