package Elevator_System;

public class ElevatorCar {
  private int id;
  private Door door;
  private Display display;
  private ElevatorPanel panel;

  private ElevatorState state;
  private int currentFloor;

  public void move();
  public void stop();
  public void openDoor();
  public void closeDoor();
}
