// ParkingSpot is an abstract class
public abstract class ParkingSpot {
  private int id;
  private boolean isFree;
  private Vehicle vehicle;

  public boolean getIsFree();
  public abstract boolean assignVehicle(Vehicle vehicle);
  public boolean removeVehicle(){
    // definition
  }
}

public class Handicapped extends ParkingSpot {
  public boolean assignVehicle(Vehicle vehicle) {
    // definition
  }
}

public class Compact extends ParkingSpot {
  public boolean assignVehicle(Vehicle vehicle) {
    // definition
  }
}

public class Large extends ParkingSpot {
  public boolean assignVehicle(Vehicle vehicle) {
    // definition
  }
}

public class Motorcycle extends ParkingSpot {
  public boolean assignVehicle(Vehicle vehicle) {
    // definition
  }
}
