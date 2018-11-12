// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: February 28th, 2017
// Filename: Manager.java
// Description: Class for creating a new
// manager, extended from employee class, adding dept
public class Manager extends Employee {

	private String department = "";

	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
		// Builds a constructor off of the Employee class w/super
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String toString() {
		return (super.toString() + " Department: " + this.department);
	}
	// Override toString and add Dept to previous printed info
}