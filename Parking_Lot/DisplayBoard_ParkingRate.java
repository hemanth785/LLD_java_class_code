public class DisplayBoard {
  // Data members
  private int id;
  private Map<String, List<ParkingSpot>> parkingSpots;

  // Constructor
  public DisplayBoard_ParkingRate(int id) {
    this.id = id;
    this.parkingSpots = new HashMap<>();
  }
  
  // Member function
  public void addParkingSpot(String spotType, List<ParkingSpot> spots);
  public void showFreeSlot();
}

public class ParkingRate {
  // Data members
  private double hours;
  private double rate;

  // Member function
  public void calculate();
}