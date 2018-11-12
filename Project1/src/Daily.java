// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: March 10th, 2017
// Filename: Daily.java
// Description: Creates an appointment
// which occurs every single day.
public class Daily extends Appointment {

	public Daily(String desc, int year, int month, int dayOfMonth) {
		super(desc, year, month, dayOfMonth);
	}
	/*
	 * Builds off of the appointment class constructor with a 
	 * super to pass the variables off. This allows this constructor
	 * to be minimal because monthly extends Appointment.
	 */
	
	public  boolean occursOn(int year, int month, int day) {
		if (year > getYear() && month > getMonth()) {
			return true;
		}
		if (year == getYear() && month == getMonth()) {
			if (day >= getDayOfMonth()) {
				return true;
			}
		}
		return false;
	}
	/*
	 * A simple boolean method that checks if an event occurs on
	 * the date entered with a simple if statement, returning true
	 * if it occurs, otherwise returning false.
	 */
	
	public String toString() {
		return super.toString();
	}
	/*
	 * Override the toString() class and print off of
	 * the super text
	 */
}