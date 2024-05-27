package Movie_Ticket_Booking;

public class ShowTime {
  // Data members
  private int showId;
  
  // The Date datatype represents and deals with both date and time
  private Date startTime; 
  private Date date;
  private int duration;
  private List<Seat> seats;
  
  // Displays the list of available seats
  public void showAvailableSeats();
}
