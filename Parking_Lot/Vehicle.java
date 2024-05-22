// Vehicle is an abstract class
public abstract class Vehicle {
  private int licenseNo;
  public abstract void assignTicket(ParkingTicket ticket);
}

public class Car extends Vehicle {
  public void assignTicket(ParkingTicket ticket) {
    // definition
  }
}

public class Van extends Vehicle {
  public void assignTicket(ParkingTicket ticket) {
    // definition
  }
}

public class Truck extends Vehicle {
  public void assignTicket(ParkingTicket ticket) {
    // definition
  }
}

public class MotorCycle extends Vehicle {
  public void assignTicket(ParkingTicket ticket) {
    // definition
  }
}
