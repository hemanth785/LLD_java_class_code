package A09_Elevator_System;

public class Building {
  private List<Floor> floors;
  private elevator ElevarSystem; 

  private static Building building = null;
  
  public static Building getInstance() {
      if (building == null) {
          building = new Building();
      }
      return building;
  }
}


