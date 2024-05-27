package Movie_Ticket_Booking;

import Movie_Ticket_Booking.Enumerations.SeatStatus;

public class Seat {
  // Seat is an abstract class
  public abstract class Seat {
    // Data members
    private String seatNo;
    private SeatStatus status; // Refers to the SeatStatus enum

    // Member functions
    public boolean isAvailable();
    public abstract void setSeat();
    public abstract void setRate();
  }

  public class Platinum extends Seat {
    private double rate;
    public void setSeat() {
      // definition
    }
    public void setRate() {
      // definition
    }
  }

  public class Gold extends Seat {
    private double rate;
    public void setSeat() {
      // definition
    }
    public void setRate() {
      // definition
    }
  }

  public class Silver extends Seat {
    private double rate;
    public void setSeat() {
      // definition
    }
    public void setRate() {
      // definition
    }
  }
}
