package Movie_Ticket_Booking;

import java.util.List;

public class Actors {
  // Person is an abstract class
  public abstract class Person {
    private String name;
    private String address;
    private String phone;
    private String email;
  }

  public class Customer extends Person {
    private List<Bookings> bookings; // List of bookings 
    
    // booking here refers to an instance of the Booking class
    public boolean createBooking(Booking booking);
    public boolean updateBooking(Booking booking);
    public boolean deleteBooking(Booking booking);
  }

  public class Admin extends Person {
    // show here refers to an instance of the ShowTime class
    public boolean addShow(Show show);
    public boolean updateShow(Show show);
    public boolean deleteShow(Show show);
    public boolean addMovie(Movie movie);
    public boolean deleteMovie(Movie movie);
  }

  public class TicketAgent extends Person {
    // booking here refers to an instance of the Booking class
    public boolean createBooking(Booking booking);
  }
}
