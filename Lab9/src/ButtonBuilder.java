// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: April 4th, 2017
// Filename: ButtonBuilder.java
// Description: Support for building buttons in Bill
package edu.miamioh.bowserbl;

import javax.swing.JButton;

public class ButtonBuilder extends JButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String desc;
	private double price;

	/**
	 * Takes a JButton and adds a description and price to it.
	 * Buttons built with this class have the description on
	 * them. 
	 *
	 * @param  desc String of button name
	 * @param  price The price of the menu item
	 */
	public ButtonBuilder(String desc, double price) {
		super(desc);
		this.desc = desc;
		this.price = price;
	}
	// Getters and setters below
	public String getDesc() {
		return desc;
	}

	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return desc;
	}
}