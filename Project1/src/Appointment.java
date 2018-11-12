// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: March 10th, 2017
// Filename: Appointment.java
// Description: Creates an appointment class
// which is used by Monthly, Onetime, and Daily.
import java.util.*;

public abstract class Appointment {
/* 
 * Create an abstract class to prevent the creation
 * of an Appointment object. Appointment is extended
 * to Monthly.java, Onetime.java, and Daily.java
 */

	private String desc;
	private int year, month, dayOfMonth;
	Calendar cal = new GregorianCalendar(year, month, dayOfMonth);
	/* 
	 * Create a new Gregorian Calendar, string for
	 * the description, and integer values for the
	 * year, month, and date
	 */
	
	public Appointment(String desc, int year, int month, int dayOfMonth) {
		this.desc = desc;
		this.month = month;
		this.year = year;
		this.dayOfMonth = dayOfMonth;
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, dayOfMonth);
	}
	/* 
	 * Builds a constructor that is used by the Monthly,
	 * Onetime, and Daily classes. Constructor sets the 
	 * input days as gregorian calendar types. Because this
	 * class is abstract, you cannot create an appointment
	 * object with it.
	 */
	
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}
	/*
	 * Getters and setters are displayed above
	 */

	public String toString() {
		return cal.get(Calendar.MONTH) + " " + cal.get(Calendar.DAY_OF_MONTH) + " " + cal.get(Calendar.YEAR) + "\n" + desc + "\n";
	}
	/*
	 * Override the toString() method to output data in the
	 * format that is more ideal for the AppointmentBook. This
	 * will convert the Gregorian calendar dates into a string
	 * with spacing in between, followed by the description on
	 * the next line.
	 */
	
	public abstract boolean occursOn(int year, int month, int day);
	/*
	 * This method is abstract because it is not usable as their is
	 * no such thing as an appointment. It is supporting the occursOn
	 * methods in the other classes.
	 */
}
