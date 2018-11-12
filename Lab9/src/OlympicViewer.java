// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: April 4th, 2017
// Filename: OlympicViewer.java
// Description: Displays the olympic rings
package edu.miamioh.bowserbl;

import javax.swing.JFrame;

public class OlympicViewer {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setTitle("The Olympic Rings");
		
		// Call the olympicrings object below to add to frame
		OlympicRings ring = new OlympicRings();
		frame.add(ring);
		frame.setVisible(true);
		frame.setSize(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}