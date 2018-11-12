// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: February 28th, 2017
// Filename: Executive.java
// Description: Class for creating a new
// Executive, extended from Manager class,
// adding Office location
public class Executive extends Manager {

	private String officeLoc = "";

	public Executive(String name, double salary, String department, String officeLoc) {
		super(name, salary, department);
		this.officeLoc = officeLoc;					
	}
	// Build a constructor 

	public String toString() {
		return (super.toString() + " Office Location: " + this.officeLoc);
	}
	// Override toString to add location to previously printed info
	public String getOfficeLoc() {
		return officeLoc;
	}
	public void setOfficeLoc(String officeLoc) {
		this.officeLoc = officeLoc;
	}
}