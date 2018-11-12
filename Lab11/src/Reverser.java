// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: April 25th, 2017
// Filename: Reverser.java
// Description: Takes a string and returns
// it reversed by using recursion.
package edu.miamioh.bowserbl;

public class Reverser {

	public static void main(String args[]) {
		
		String first = "CSE271IsTheBestClassYouCanTake";
		String second = "Hello";
		String third = "!321skwaHdeRimaiM";
		String fourth = "ekaTnaCuoYssalCtseBehTsI172ESC";
		String fifth = "";

		System.out.println(reverse(first));
		System.out.println(reverse(second));
		System.out.println(reverse(third));	
		System.out.println(reverse(fourth));		
		System.out.println(reverse(fifth));
	}

	/**
	 * Takes in a string and returns a reversed
	 * version of the original using recursion.
	 *
	 * @param text String to be reversed
	 * @return String
	 */
	public static String reverse(String text) {
		if (text.length() <= 1) { // in case of blank string <=
			return text;
		}
		else {
			return reverse(text.substring(1)) + text.charAt(0);
		}
	}
}