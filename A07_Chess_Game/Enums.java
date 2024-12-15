package A07_Chess_Game;

public class Enums {
  
}


enum GameStatus {
  Active,
  BlackWin,
  WhiteWin,
  Forfeit,
  Stalemate,
  Resignation
}

enum AccountStatus {
  ACTIVE, 
  CLOSED, 
  CANCELED, 
  BLACKLISTED, 
  NONE
}

// Custom Person data type class
class Person {
  private String name;
  private String streetAddress;
  private String city;
  private String state;
  private int zipCode;
  private String country;
}
