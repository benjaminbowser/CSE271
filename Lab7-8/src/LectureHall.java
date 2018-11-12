// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: March 29th, 2017
// Filename: LectureHall.java
// Description: Contains a name and capacity
// for a lecture hall object to be made
package edu.miamioh.bowserbl;

/**
 * @author bowserbl
 *
 */
public class LectureHall {

	private int capacity;
	private String name;
	
	public LectureHall(int capacity, String name) {
		super();
		this.capacity = capacity;
		this.name = name;
	}

	/**
	@return Name of lecture hall and capacity
	 */
	public String toString() {
		return "The Lecture Hall named " + name + " has a capacity of " + capacity + " students";
	}
}