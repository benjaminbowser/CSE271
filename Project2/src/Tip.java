package edu.miamioh.bowserbl;

/**
 * @author bowserbl
 *
 */
public class Tip {

	private boolean board[][];
	private String suggestion;

	/**
	 * Takes in a boolean 2D array
	 * @param board True if a queen is placed at x,y location
	 */
	public Tip(boolean board[][]) {
		this.board = board;
	}

	/**
	 * @return String of a location to place at
	 */
	public String getTip() {
		tipHelper();
		return suggestion;
	}

	/**
	 * Iterates through safe method to find the first safe space with the
	 * given boolean board.
	 */
	private void tipHelper() {
		boolean safeSpot = false;
		while (!safeSpot) {
			for (int i = 0; i < board.length; i++) {
				if (safeSpot) {
					break;
				}
				for (int j = 0; j < board.length; j++) {
					if (safe(board, i, j) == true) {
						suggestion = i + "," + j;
						safeSpot = true;
						break;
					}
				}
			}
			safeSpot = true;
		}
	}

	/**
	 * Takes in a board, row, and column then checks if the given location
	 * is indeed a safe location based on the current state of the board.
	 * 
	 * @param board Boolean 2D array of the current board
	 * @param row int of the row to check
	 * @param col int of the column to check
	 * @return boolean if the location is safe
	 */
	private static boolean safe(boolean[][] board, int row, int col)
	{
		// Help from: http://cs.carleton.edu/faculty/dmusican/cs201w08/code/recursion/Queens.java
		int i, j;

		// Columns
		for (i = 0; i < board.length; i++) {
			if (board[i][col] == true) {
				return false;
			}
		}

		// Rows
		for (j = 0; j<board.length; j++) {
			if (board[row][j] == true) {
				return false;
			}
		}

		// Diagonals
		for (i = row, j = col; i < board.length && j < board.length; i++, j++) {
			if (board[i][j] == true) {
				return false;
			}
		}

		// Diagonals
		for (i = row, j = col; i >=0 && j >=0; i--, j--) { 
			if (board[i][j] == true) {
				return false;
			}
		}

		// Diagonals
		for (i=row, j=col; i >=0 && j < board.length; i--, j++) {
			if (board[i][j] == true) {
				return false;
			}
		}

		// Diagonals
		for (i=row, j=col; i < board.length && j >=0 ; i++, j--) {
			if (board[i][j] == true) {
				return false;
			}
		}

		// Assume safe if all other tests fail
		return true;
	}	
}