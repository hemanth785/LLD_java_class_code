public class ParkingLot {
  private int id;
  private String name;
  private String address;
  private ParkingRate parkingRate;

  private HashMap<String, Entrance> entrance;
  private HashMap<String, Exit> exit;

  // Create a hashmap that identifies all currently generated tickets using their ticket number
  private HashMap<String, ParkingTicket> tickets;

  // The ParkingLot is a singleton class that ensures it will have only one active instance at a time
  // Both the Entrance and Exit classes use this class to create and close parking tickets
  private static ParkingLot parkingLot = null;

  // Created a private constructor to add a restriction (due to Singleton)
  private ParkingLot() {
      // Call the name, address and parking_rate 
      // Create initial entrance and exit hashmaps respectively
  }

  // Created a static method to access the singleton instance of ParkingLot
  public static ParkingLot getInstance() {
      if (parkingLot == null) {
          parkingLot = new ParkingLot();
      }
      return parkingLot;
  }

  public boolean addEntrance(Entrance entrance){}
  public boolean addExit(Exit exit){}

  // This function allows parking tickets to be available at multiple entrances
  public ParkingTicket getParkingTicket(Vehicle vehicle) {}

  public boolean isFull(ParkingSpot type){}
}