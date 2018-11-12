package edu.miamioh.bowserbl;

/**
 * @author bowserbl
 *
 */
public class ValidCheck {
	private static int failX;
	private static int failY;

	public ValidCheck() {
	}

	public int getFailX() {
		return failX;
	}

	public int getFailY() {
		return failY;
	}

	/**
	 * Takes in a board and checks it against checkBoard
	 * @param board Boolean array of queens on board
	 * @return true if board is safe
	 */
	public boolean verifyBoard(boolean[][] board) {
		return checkBoard(board);
	}

	private boolean checkBoard(boolean board[][]){
		/*
		 * Help from:
		 * http://www.mathcs.emory.edu/~dsavenk/courses/fall13/cs170/hw/EightQueensSolved.java	
		 * http://cs.carleton.edu/faculty/dmusican/cs201w08/code/recursion/Queens.java 
		 */
		return checkRows(board) && checkColumns(board) && checkDiagonals(board);
	}

	// Check for 2 on same row
	private static boolean checkRows(boolean board[][]){
		for (int i = 0; i < board.length; i++) {
			boolean rowHasQueen = false;
			for (int j = 0; j < board.length; j++) {
				if(board[i][j]){
					if(rowHasQueen){
						failX = i;
						failY = j;
						return false;
					}
					rowHasQueen = true;
				}
			}
		}
		return true;
	}

	// Check for 2 in same column
	private static boolean checkColumns(boolean[][] board){
		for (int i = 0; i < board.length; i++) {
			boolean colHasQueen = false;
			for (int j = 0; j < board.length; j++) {
				if(board[j][i]){
					if(colHasQueen){
						failX = j;
						failY = i;
						return false;
					}
					colHasQueen = true;
				}
			}
		}
		return true;
	}

	private static boolean checkDiagonals(boolean[][] board) {
		// Checks the diagonals
		for (int row = 0; row < 8; ++row) {
			boolean hasQueen = false;
			for (int col = 0; row + col < 8; ++col) {
				if (board[row + col][col]) {
					if (hasQueen) {
						failX = row + col;
						failY = col;
						return false; 
					}
					hasQueen = true;
				}
			}
		}

		for (int col = 0; col < 8; ++col) {
			boolean hasQueen = false;
			for (int row = 0; row + col < 8; ++row) {
				if (board[row][row + col]) {
					if (hasQueen) {
						failX = row;
						failY = row + col;
						return false; 
					}
					hasQueen = true;
				}
			}
		}

		for (int row = 0; row < 8; ++row) {
			boolean hasQueen = false;
			for (int col = 0; row - col >= 0; ++col) {
				if (board[row - col][col]) {
					if (hasQueen) {
						failX = row - col;
						failY = col;
						return false; 
					}
					hasQueen = true;
				}
			}
		}
		for (int col = 0; col < 8; ++col) {
			boolean hasQueen = false;
			for (int row = 7; 7 - row + col < 8; --row) {
				if (board[row][7 - row + col]) {
					if (hasQueen) {
						failX = row;
						failY = 7 - row + col;
						return false; 
					}
					hasQueen = true;
				}
			}
		}   
		return true;
	}    
}