package A09_Elevator_System;

public class Door {
  private DoorState state;
  
  public boolean isOpen();
}

class Floor {
  private List<Display> display;
  private List<HallPanel> panel;
  
  public boolean isBottomMost();
  public boolean isTopMost();
}
