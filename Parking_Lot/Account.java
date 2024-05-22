public abstract class Account {
  // Data members
  private String userName;
  private String password;
  private Person person; // Refers to an instance of the Person class
  private AccountStatus status; // Refers to the AccountStatus enum

  public abstract boolean resetPassword();
}

public class Admin extends Account {
  // spot here refers to an instance of the ParkingSpot class
  public boolean addParkingSpot(ParkingSpot spot);
  // displayBoard here refers to an instance of the DisplayBoard class
  public boolean addDisplayBoard(DisplayBoard_ParkingRate displayBoard);
  // entrance here refers to an instance of the Entrance class
  public boolean addEntrance(Entrance_Exit entrance);
  // exit here refers to an instance of the Exit class
  public boolean addExit(Exit exit);

  // Will implement the functionality in this class
  public boolean resetPassword() {
    // definition
  }
}

public class ParkingAttendant extends Account {
  public boolean processTicket(String ticketNumber);

  // Will implement the functionality in this class
  public boolean resetPassword() {
    // definition
  }
}
