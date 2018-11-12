package edu.miamioh.bowserbl;

import javax.swing.JFrame;

/**
 * @author bowserbl
 *
 */
public class QueensViewer {

	/**
	 * Creates a new Queens object that is added
	 * to a JFrame that displays the object.
	 */
	public static void main(String[] args) {
		QueensBoard board = new QueensBoard();
		JFrame frame = new JFrame();
		frame.add(board);
		frame.setTitle("Queens Advice");
		frame.setVisible(true);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}
}