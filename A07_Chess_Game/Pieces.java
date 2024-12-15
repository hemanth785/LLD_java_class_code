package A07_Chess_Game;

public class Pieces {
  
}

abstract class Piece {
  private boolean killed = false;
  private boolean white = false;

  public abstract boolean isWhite();
  public abstract boolean isKilled(); 
  public abstract boolean canMove(Chessboard board, Box start, Box end);
}

class King extends Piece {
  private boolean castlingDone = false;

  @Override
  public boolean canMove(Board board, Box start, Box end) {
    // definition
  }
}

class Queen extends Piece {

  @Override
  public boolean canMove(Board board, Box start, Box end) {
    // definition
  }
}

class Knight extends Piece {

  @Override
  public boolean canMove(Board board, Box start, Box end) {
    // definition
  }
}

class Bishop extends Piece {

  @Override
  public boolean canMove(Board board, Box start, Box end) {
    // definition
  }
}

class Rook extends Piece {

  @Override
  public boolean canMove(Board board, Box start, Box end) {
    // definition
  }
}

class Pawn extends Piece {

  @Override
  public boolean canMove(Board board, Box start, Box end) {
    // definition
  }
}
