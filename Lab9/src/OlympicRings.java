// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: April 4th, 2017
// Filename: OlympicRings.java
// Description: Draws the olympic rings
package edu.miamioh.bowserbl;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class OlympicRings extends JComponent {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Draws rings depending on the sizes specified
	 * and the color. 
	 *
	 * @param  g Graphics object
	 * @param  color Color object
	 * @param  one x Coordinate for object
	 * @param  two y Coordinate for object
	 * @param  size1 Size1 dimension for object
	 * @param  size2 Size2 dimension for object
	 */
	public void drawRing (Graphics g, Color color, int one, int two, int size1, int size2) {
		g.drawOval(one, two, size1, size2);
		g.setColor(color);
	}	
	
	/**
	 * Draws Olympic rings onto the object 
	 *
	 * @param  g Graphics object
	 */
	public void paintComponent(Graphics g)
	{
		drawRing(g, Color.GREEN, 60, 0, 45, 45); 
		drawRing(g, Color.RED, 80, 20, 45, 45); 
		drawRing(g, Color.BLUE, 105, 0, 45, 45); 
		drawRing(g, Color.YELLOW, 15, 0, 45, 45); 
		drawRing(g, Color.BLACK, 35, 20, 45, 45); 
	}
}