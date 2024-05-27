package Movie_Ticket_Booking;

public class Search_and_Catalog {
  public interface Search {
    public List<Movie> searchMovieTitle(String title);
    public List<Movie> searchMovieLanguage(String language);
    public List<Movie> searchMovieGenre(String genre);
    public List<Movie> searchMovieReleaseDate(Date date);
  }

  public class Catalog implements Search {
    HashMap<String, List<Movie>> movieTitles;
    HashMap<String, List<Movie>> movieLanguages;
    HashMap<String, List<Movie>> movieGenres;

    // The Date datatype represents and deals with both date and time.
    HashMap<Date, List<Movie>> movieReleaseDates;

    public List<Movie> searchMovieTitle(String title) {
      // functionality
    }

    public List<Movie> searchMovieLanguage(String language) {
      // functionality
    }

    public List<Movie> searchMovieGenre(String genre) {
      // functionality
    }

    public List<Movie> searchMovieReleaseDate(Date date) {
      // functionality
    }
  }
}
