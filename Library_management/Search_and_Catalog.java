package Library_management;

import java.util.HashMap;
import java.util.List;

import Library_management.Book_and_Rack.Book;

public class Search_and_Catalog {
  public interface Search {
    // Interface method (does not have a body)
    public List<Book> searchByTitle(String title);
    public List<Book> searchByAuthor(String author);
    public List<Book> searchBySubject(String subject);
    public List<Book> searchByPublicationDate(Date publishDate);
  }

  public class Catalog implements Search {
    private HashMap<String, List<Book>> bookTitles;
    private HashMap<String, List<Book>> bookAuthors;
    private HashMap<String, List<Book>> bookSubjects;
    private HashMap<String, List<Book>> bookPublicationDates;

    public List<Book> searchByTitle(String query) {
        // definition
    }
    public List<Book> searchByAuthor(String query) {
        // definition
    }
    public List<Book> searchBySubject(String query) {
        // definition
    }
    public List<Book> searchByPublicationDate(String query) {
        // definition
    }
  }
}
