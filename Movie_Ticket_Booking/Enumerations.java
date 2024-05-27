package Movie_Ticket_Booking;

public class Enumerations {
  // Enumerations
  enum PaymentStatus {
    PENDING, 
    CONFIRMED, 
    DECLINED, 
    REFUNDED
  }

  enum BookingStatus {
    PENDING, 
    CONFIRMED, 
    CANCELLED,
    DENIED, 
    REFUNDED
  }

  enum SeatStatus {
    AVAILABLE,
    BOOKED,
    RESERVED
  }
}
