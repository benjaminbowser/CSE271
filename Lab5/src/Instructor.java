// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: February 28th, 2017
// Filename: Instructor.java
// Description: Class for creating a new
// instructor, extending person, adding salary
public class Instructor extends Person {

	private double salary = 0;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Instructor(String name, int year, double salary) {
		super(name, year);
		this.salary = salary;
	}
	// Create the Instructor constructor
	public String toString() {
		return (super.toString() + " Salary: " + this.salary);
	}
	// Override toString method to add salary to the previous output
}