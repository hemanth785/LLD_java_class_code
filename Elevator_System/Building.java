package Elevator_System;

public class Building {
  private List<Floor> floor;
  private List<ElevatorCar> elevator; 

  private static Building building = null;
  
  public static Building getInstance() {
      if (building == null) {
          building = new Building();
      }
      return building;
  }
}
