// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: March 29th, 2017
// Filename: Person.java
// Description: Abstract class to
// support people classes
package edu.miamioh.bowserbl;

/**
 * @author bowserbl
 *
 */
public abstract class Person {

	private int identifier = 0;
	private String email = "";
	
	public Person(int identifier, String email) {
		super();
		this.identifier = identifier;
		this.email = email;
	}

	/**
	 * toString method to support printing out 
	 * details of people
	 * @return Returns ID number and Email address
	 */
	public String toString() {
		return "ID: " +identifier + "\nEmail: " + email + "\n";
	}
}