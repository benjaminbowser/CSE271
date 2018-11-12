// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: April 12th, 2017
// Filename: ColourViewer.java
// Description: Displays the ColourFun class
// inside of a frame.
package edu.miamioh.bowserbl;

import javax.swing.JFrame;

/**
 * @author bowserbl
 *
 */
public class ColourViewer {

	/**
	 * Creates a new frame with the ColourFun class and
	 * displays it to the user.
	 */
	public static void main(String[] args) {
	
		JFrame frame = new ColourFun();
		frame.setTitle("Colour Fun");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);     
		frame.setSize(400, 400);
	}
}