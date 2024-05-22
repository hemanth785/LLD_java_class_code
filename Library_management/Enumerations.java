package Library_management;

public class Enumerations {
  // definition of enumerations used in library management system
  enum BookFormat {
    HARDCOVER,
    PAPERBACK,
    AUDIOBOOK,
    EBOOK,
    NEWSPAPER,
    MAGAZINE,
    JOURNAL
  }

  enum BookStatus {
    AVAILABLE,
    RESERVED,
    LOANED,
    LOST
  }

  enum ReservationStatus {
    WAITING,
    PENDING,
    CANCELED,
    NONE
  }

  enum AccountStatus {
    ACTIVE,
    CLOSED,
    CANCELED,
    BLACKLISTED,
    NONE
  }
}
