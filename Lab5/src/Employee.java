// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: February 28th, 2017
// Filename: Employee.java
// Description: Class for creating a new
// student, extended from person class, adding major
public class Employee {

	private String name = "";
	private double salary = 0;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	// Build the constructor here

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return ("Name: " + this.name + " Salary: " + this.salary);
	}
	// Override toString to output name and salary
}