package sudoku.solver;


public class Sudoku {

    private int[][] board;

    public Sudoku(int[][] board) {
        this.board = board;
    }
    // this function prints the board 
    public void printBoard() {
        for (int[] is : this.board) {
            for (int i : is) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }
    // this function finds the next position to try an number
    public int[] findEmpty() {
        int[] nextPos = {-1,-1};  
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (this.board[i][j] == 0) {
                    nextPos[0] = i;
                    nextPos[1] = j;
                    return nextPos;
                }
            }
        }
        return nextPos;
    }
    // tests an number given the position i.e row/column and the square.
    public boolean valid(int[] pos, int num) {

        //row
        for (int i = 0; i < board.length; i++) {
            if (this.board[pos[0]][i] == num && i != pos[1]){
                return false;
            }
        }

        //column
        for (int i = 0; i < board.length; i++) {
            if (this.board[i][pos[1]] == num && i != pos[0]) {
                return false;
            }
        }


        //square
        int boxX = pos[0] / 3;
        int boxY = pos[1] / 3;


        for (int i = boxX * 3; i < boxX * 3 + 3; i++) {
            for (int j = boxY * 3; j < boxY * 3 + 3; j++) {
                if (board[i][j] == num && i != pos[0] && j != pos[1]){
                    return false;
                }
            }
        }


        return true;
    }
    /*
    using backtracking this function goes forward until number is not in the right position or the board doesn't have empty spaces(0s).
    When the number is not on right position "backtracks" to the previous position and try another number, if needed "backtracks" again 
    or goes forward again.
    
    
    */
    public boolean solve () {

        int[] pos = findEmpty().clone();

        if (pos[0] == -1 && pos[1] == -1) {
            return true;
        }
        for (int i = 1; i < 10; i++) {
            if (valid(pos, i)) {
                this.board[pos[0]][pos[1]] = i;
                
                if (solve()) {
                    return true;
                }

                this.board[pos[0]][pos[1]] = 0;
            }
        }

        return false;
    }


}
