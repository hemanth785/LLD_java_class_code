package A07_Chess_Game;

class Account {
  private int id;
  private String password;
  private AccountStatus status;

  public boolean resetPassword(){
    return false;
  }
}

public class Player extends Account {
  private Person person;
  private boolean whiteSide = false;
  private int totalGamesPlayed;

  public boolean isWhiteSide(){
    return whiteSide;
  }

  public boolean isChecked(){
    return false;
  }
}

class Admin extends Account {
  public boolean blockUser(){
    return false;
  }
}
