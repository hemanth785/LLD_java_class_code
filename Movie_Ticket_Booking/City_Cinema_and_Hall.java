package Movie_Ticket_Booking;

import java.util.List;

public class City_Cinema_and_Hall {
  public class City {
    // Data members
    private String name;
    private String state;
    private int zipCode;
    private List<Cinema> cinemas;
  }

  public class Cinema {
    // Data members
    private int cinemaId;
    private List<Hall> halls;
    private City city;
  }

  public class Hall {
    // Data members
    private int hallId;
    private List<ShowTime> shows;

    // Returns list of shows
    public List<ShowTime> findCurrentShows();
  }
}
