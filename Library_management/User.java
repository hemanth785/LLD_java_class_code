package Library_management;

import Library_management.Enumerations.AccountStatus;

public class User {
  // User is an abstract class
  public abstract class User {
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;
    private LibraryCard card;

    public abstract boolean resetPassword();
  }

  public class Librarian extends User {
    public boolean addBookItem(BookItem bookItem);
    public boolean blockMember(Member member);
    public boolean unBlockMember(Member member);
    public boolean resetPassword() {
        // definition
    }
    public boolean addBookItem(BookItem bookItem) {
        // definition
    }
  }

  public class Member extends User {
    private Date dateOfMembership;
    private LibraryCard memershipCard;
    private int totalBooksCheckedOut;

    public boolean reserveBookItem(BookItem bookItem);
    private void incrementTotalBooksCheckedOut();
    public boolean checkoutBookItem(BookItem bookItem); 
    private void checkForFine(String bookItemId);
    public void returnBookItem(BookItem bookItem);
    public boolean renewBookItem(BookItem bookItem);
    public boolean resetPassword() {
        // definition
    }
  }
}
