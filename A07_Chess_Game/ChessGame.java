package A07_Chess_Game;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/*
 *   -Box and Chessboard-
 */
class Box {
  private Piece piece;
  private int x;
  private int y;

  public Piece getPiece(){
    return piece;
  }
}

class Chessboard {
  private Box[][] boxes;
  private Date creationDate;
  private int totalRows;
  private int totalCols;

  Chessboard(int totalRows, int totalCols){
    this.totalRows = totalRows;
    this.totalCols = totalCols;
    resetBoard();
  }
  
  // This is the function to get all pieces which present on board right now.
  public List<Piece> getPieces(){
    List<Piece> pieces = new ArrayList<Piece>();

    for(int i=0; i<totalRows; i++){
      for(int j=0; j<totalCols; j++){
        Box box = boxes[i][j];
        if(box.getPiece() != null){
          pieces.add(box.getPiece());
        }
      }
    }

    return pieces;
  }

  public void resetBoard(){
    // 1. remove all the pieces the intial positions in board, 
    // 2. remove rest of the pieces from the board
  }

  public void updateBoard(Move move){
    // This method will be called by 'makeMove()' method of chessgame class.
    // Actual moves of pieces on board will be done here.
  }
}


/*
 * Move: This class is used to store the each move details, kind of as logs
 */

class Move {
  private Box start;
  private Box end;
  private Piece pieceKilled;
  private Piece pieceMoved;
  private Player player;
  private boolean castlingMove = false;

  public boolean isCastlingMove(){
    return false;
  }
}

/*
 * Chessgame: 
 */

public class ChessGame {
  private Queue<Player> players;
  private Chessboard board;
  private Player currentTurn;
  private GameStatus status;
  private List<Move> movesPlayed;
  

  public ChessGame(){
    this.initiateGame();
  }

  public boolean isOver(){
    return false;
  }

  private void initiateGame(){
    this.board = new Chessboard(8, 8);
    this.status = GameStatus.Active;
    this.players = new LinkedList<>();
  } 

  public void addPlayer(Player player){
    if(players.size() >= 2){
      System.out.println("Only 2 players is allowed");
      return;
    }
    players.add(player);
  }

  //This function is called when player makes a move on chessboard
  public boolean playerMove(Player player, int startX, int startY, int endX, int endY) {
    //Verify if the player is currentTurn player
    if(!player.equals(currentTurn)){
      System.out.println("You are not allowed to make a move");
      return false;
    }

    /* 1. get start box 
       2. get end box
       3. create 'Move' object
       4. call makeMove() method
    */

    //Updating nextTurn player and moving him back to queue
    currentTurn = players.poll();
    players.add(currentTurn);

    return true;
  }

  private boolean makeMove(Move move, Player player) {
    boolean isValidMove = validateMove(move, player);
    if(!isValidMove){
      return false;
    }

    board.updateBoard(move);
      
    return isValidMove;
  }

  public boolean validateMove(Move move, Player player){
    //    2. Check whether or not the color of the piece is white
    //    3. Check if it is a valid move or not
    //    4. Check whether it is a castling move or not
    return true;
  }
}

