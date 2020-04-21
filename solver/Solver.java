package sudoku.solver;


public class Solver {


    public static void main(String[] args) {
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
    

    //System.out.print(2 / 3);

    }
}