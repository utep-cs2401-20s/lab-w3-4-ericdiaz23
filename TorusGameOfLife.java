/* Eric Diaz, 80647920
/ Martine Ceberio Lab #3 */

public class TorusGameOfLife extends GameOfLife {
    // for each cell, count live neighbors deternube live/dead for new board start
    // Early patterns with unknown futures, such as the R-pentomino, led computer programmers across the world to write programs to track the evolution of Life patterns. Most of the early algorithms were similar: they represented Life patterns as two-dimensional arrays in computer memory. Typically two arrays are used: one to hold the current generation, and one to calculate its successor. Often 0 and 1 represent dead and live cells respectively. A nested for loop considers each element of the current array in turn, counting the live neighbours of each cell to decide whether the corresponding element of the successor array should be 0 or 1. The successor array is displayed. For the next iteration, the arrays swap roles so that the successor array in the last iteration becomes the current array in the next iteration
    int size;
    int[][] board;
    int[][] prevBoard;

    public static void main(String[] args {
        return this.board;
    }

    public board(){ // Default Constuctor
        int[][] board = new board[][];

    }

    public board(int size){ // Constructor that creates new board in the dimensions of size x size
        Random random = new Random();
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                board[i][j] = int(random(2));
            }
        }

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
        int[][] newGen = new int[this.size][this.size];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 0 && neighbors(i,j) == 3)
                {
                    newGen[i][j] == 1;
                }
                else if(board[i][j] == 1 && neighbors(i,j) < 2)
                {
                    newGen[i][j] == 0;
                }
                else if(board[i][j] == 1 && neighbors(i,j) > 3)
                {
                    newGen[i][j] == 0;
                }
                else if(board[i][j] == 1 && neighbors(i,j) == 2 || neighbors(i,j) == 3)
                {
                    newGen[i][j] == 0;
                }
                else {
                    newGen[i][j] += board[i][j];
                }
            }
        }
        board = newGen;

    }

    public int neighbors(int x, int y) {
        int liveNeighbors = 0; // Want to have count variable that will keep track of # of neighbors
        // TODO: How can we count the number of neighbors in the proximity of the cell we are viewing?
        if(board[x-1][y-1] == 1) liveNeighbors++;
        else if(board[x-1][y] == 1) liveNeighbors++;
        else if(board[x-1][y+1] == 1) liveNeighbors++;
        else if(board[x][y-1] == 1) liveNeighbors++;
        else if(board[x][y+1] == 1) liveNeighbors++;
        else if(board[x+1][y-1] == 1) liveNeighbors++;
        else if(board[x+1][y] == 1) liveNeighbors++;
        else if(board[x+1][y+1] == 1) liveNeighbors++;
        return liveNeighbors;
    }

    public void evolution(int n){ //Transforms board into shape after n steps of evolution
        for(int i = 0; i <= n; i++){
            oneStep(n);
        }
    }

}