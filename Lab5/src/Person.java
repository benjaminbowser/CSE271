// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: February 28th, 2017
// Filename: Person.java
// Description: Class for creating a new
// person, which takes name and year.
public class Person {

	private String name = "";
	private int year = 0;
	// Creates private variables for the 
	// year and the name of the user

	public Person(String name, int year) {
		this.name = name;
		this.year = year;
	}
	// New constructor for a person

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		return ("Name: " + this.name + " Year of Birth: " + this.year);
	}
	// String output when class is used with toString method above
}