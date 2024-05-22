package Library_management;

import Library_management.Enumerations.ReservationStatus;

public class BookReservation_Lending_Fine {
  public class BookReservation {
    private String itemId;
    private Date creationDate;
    private ReservationStatus status;
    private String memberId;

    public static BookReservation fetchReservationDetails(String bookItemId);
  }

  public class BookLending {
    private String itemId;
    private Date creationDate;
    private Date dueDate;
    private Date returnDate;
    private String memberId;
    private BookReservation bookReservation;
    private User user;

    public static boolean lendBook(String bookItemId, String memberId);
    public static BookLending fetchLendingDetails(String bookItemId);
  }

  public class Fine {
    private Date creationDate;
    private String bookItemId;
    private String memberId;

    public static void collectFine(String memberId, long days);
  }
}
