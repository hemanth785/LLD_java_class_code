

import java.util.concurrent.ThreadLocalRandom;

public class A05_Board {

    Cell[] cells;

    Board(int boardSize, int numberOfSnakes, int numberOfLadders) {
        initializeCells(boardSize);
        addSnakesLadders(cells, numberOfSnakes, numberOfLadders);
    }

    private void initializeCells(int boardSize) {

        int numOfCells = boardSize*boardSize;
        cells = new Cell[numOfCells];

        for(int i=0; i<numOfCells; i++) {
            Cell cellObj = new Cell();
            cells[i] = cellObj;
        }
    }

    private void addSnakesLadders(Cell[] cells, int numberOfSnakes, int numberOfLadders){
        // Add snakes to board
        while(numberOfSnakes > 0) {
           int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length-1);
           int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length-1);
           if(snakeTail >= snakeHead) {
               continue;
           }

           Jump snakeObj = new Jump();
           snakeObj.start = snakeHead;
           snakeObj.end = snakeTail;

           Cell cell = this.getCell(snakeHead);
           cell.jump = snakeObj;

           numberOfSnakes--;
        }

        // Add ladders to board
        while(numberOfLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            if(ladderStart >= ladderEnd) {
                continue;
            }

            Jump ladderObj = new Jump();
            ladderObj.start = ladderStart;
            ladderObj.end = ladderEnd;

            Cell cell = this.getCell(ladderStart);
            cell.jump = ladderObj;

            numberOfLadders--;
        }

    }


    Cell getCell(int playerPosition) {
        // int boardRow = playerPosition / cells.length;
        // int boardColumn = (playerPosition % cells.length);
        return cells[playerPosition];
    }
}
