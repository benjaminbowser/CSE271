// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: February 10th, 2017
// Filename: Address.java
// Description: Parse data from user input involving
// an address.
package lab03;

public class Address {

	private int house;
	private String street;
	private int apt = -1;
	private String city;
	private String state;
	private String zip;

	// Constructors:
	public Address(int house, String street, int apt, String city, String state, int parsed) {
		String zip = Integer.toString(parsed);
		// Does not have apt #
		if (house <= 0 || apt <= 0 || Integer.parseInt(zip) <= 0 || zip.length() != 5) {
			System.out.println("ERROR. One of your values entered is not valid.");
		}

		this.house = house;
		this.street = street;
		this.apt = apt;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public Address(int house, String street, String city, String state, int parsed) {
		String zip = Integer.toString(parsed);
		// User has no apt #
		if (house <= 0 || Integer.parseInt(zip) <= 0 || zip.length() != 5) {
			System.out.println("ERROR. One of your values entered is not valid.");
		}

		this.house = house;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	// Getters and setters:

	public int getHouse() {
		return house;
	}
	public void setHouse(int house) {
		this.house = house;
		// Set house to -1 if invalid
		if (house <= 0) {
			house = -1;
		}
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getApt() {
		return apt;
	}
	public void setApt(int apt) {
		this.apt = apt;
		// Set apt to -1 if invalid
		if (apt <= 0) {
			apt = -1;
		}
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;

		if (Integer.parseInt(zip) <= 0 || zip.length() != 5) {
			this.zip = "-1";
			// Invalid zip code results in zip string set to -1
		}
	}
	public boolean comesBefore(Address other) {
		// Check which zip is bigger
		if (Integer.parseInt(this.zip) < Integer.parseInt(other.zip)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void print() {
		// Print out the address
		System.out.print(this.house + " ");
		System.out.print(this.street + " ");
		if (this.apt != -1) {
			System.out.print("APT #"+ this.apt + " ");
		}
		System.out.print("\n" + this.city + " ");
		System.out.print(this.state + " ");
		System.out.print(this.zip);
	}
}