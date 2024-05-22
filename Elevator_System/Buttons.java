package Elevator_System;

public abstract class Button {
  private boolean status;

  public pressDown();
  public abstract boolean isPressed();
}

public class DoorButton extends Button {

  public boolean isPressed() {
      // Definition
  }
}

public class HallButton extends Button  {
  private Direction buttonSign;

  public boolean isPressed() {
      // definition
  }
}

public class ElevatorButton extends Button  {
  private int destinationFloorNumber;

  public boolean isPressed() {
      // definition
  }
}
