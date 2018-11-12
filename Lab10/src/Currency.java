// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: April 12th, 2017
// Filename: Currency.java
// Description: GUI viewer for Converter.
package edu.miamioh.bowserbl;

import javax.swing.JFrame;
/**
 * @author bowserbl
 *
 */
public class Currency extends JFrame {

	/**
	 * Creates a new converter object that is added
	 * to a JFrame that displays the object.
	 */
	public static void main(String[] args) {
		Converter price = new Converter();
		JFrame frame = new JFrame();
		frame.add(price);
		frame.setTitle("Currency Conversion");
		frame.setVisible(true);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}
}