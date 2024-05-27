package Movie_Ticket_Booking;

public class Booking {
  // Data members
  private int bookingId;
  private int amount;
  private int totalSeats;

  // The Date datatype represents and deals with both date and time.
  private Date createdOn;

  // BookingStatus enum
  private BookingStatus status;
  
  // Instances of classes
  private Payment payment; 
  private List<MovieTicket> tickets;
  private List<Seat> seats;
}
