package sudoku.solver;


public class Solver {


    public static void main(String[] args) {
	    
	// a sudoku board that serves as an example to what the input of the sudoku class should be
        int[][] board = {
			{0,0,0,0,0,0,7,0,2},
			{0,0,0,0,0,4,0,0,0},
			{0,8,5,0,9,0,0,4,0},
			{0,0,3,1,2,0,0,0,0},
			{0,0,0,0,0,0,0,5,0},
			{4,0,1,0,0,8,0,0,0},
			{0,7,0,0,0,0,9,0,8},
			{0,9,0,0,0,5,0,0,0},
			{0,4,0,0,8,0,1,0,0}
    };
    
    Sudoku bo = new Sudoku(board);
    
    bo.printBoard();
    bo.solve();
    System.out.println();
    bo.printBoard();
    
    }
}
