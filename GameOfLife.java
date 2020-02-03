/* Eric Diaz, 80647920
/ Martine Ceberio Lab #3 */

public class GameOfLife{
        // for each cell, count live neighbors deternube live/dead for new board start
        // Early patterns with unknown futures, such as the R-pentomino, led computer programmers across the world to write programs to track the evolution of Life patterns. Most of the early algorithms were similar: they represented Life patterns as two-dimensional arrays in computer memory. Typically two arrays are used: one to hold the current generation, and one to calculate its successor. Often 0 and 1 represent dead and live cells respectively. A nested for loop considers each element of the current array in turn, counting the live neighbours of each cell to decide whether the corresponding element of the successor array should be 0 or 1. The successor array is displayed. For the next iteration, the arrays swap roles so that the successor array in the last iteration becomes the current array in the next iteration
    int size;
    int[][] board;
    int[][] prevBoard;

    public board(){ // Default Constuctor
        int[][] board = new board[][];

    }

    public board(int size){ // Constructor that creates new board in the dimensions of size x size
        int[][] board = new board[size][size];
    }

    public board(int[][] prevBoard){ // Constructor that creates new board with same size and same content as arg board
        int[][] board = new board[size][size];
        for(int i = 0; i < prevBoard.length; i++){
            for(int j = 0; j < prevBoard.length; j++){
                board[i][j] = prevBoard[i][j];
             }
        }
    }

    public int[][] getBoard() { // Getter for board
        return board;
    }

    public void oneStep(){ // Transforms board into next shape
    }

    public int neighbors(int x, int y){
        int count = 0; // Want to have count variable that will keep track of # of neighbors

    }

    public void evolution(int n){
        for(int i = 0; i <= n; i++){

        }
    }

}

