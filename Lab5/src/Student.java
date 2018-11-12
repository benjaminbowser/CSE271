// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: February 28th, 2017
// Filename: Student.java
// Description: Class for creating a new
// student, extended from person class, adding major
public class Student extends Person {

	private String major = "";
	// Create a string for the major

	public Student(String name, int year, String major) {
		super(name, year);
		this.major = major;
	}
	// New constructor for Student

	public String toString() {
		return (super.toString() + " Major: " + this.major);
	}
	// Override toString method to use superclass and adds major

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
