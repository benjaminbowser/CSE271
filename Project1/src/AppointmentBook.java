// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: March 10th, 2017
// Filename: AppointmentBook.java
// Description: Creates an AppointmentBook object
// which is used to store appointments in.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentBook {
		private static ArrayList<Appointment> data;
		/*
		 * Declare an ArrayList in the type Appointment for
		 * storing out appointment objects in
		 */

	public AppointmentBook() {
		data = new ArrayList<Appointment>();
	}
	/*
	 * Creating a new AppointmentBook will initialize the
	 * ArrayList from above.
	 */

	public static ArrayList<Appointment> getData() {
		return data;
	}
	/*
	 * Creates a getter for the ArrayList that will allow it to
	 * be used in other classes at a later point.
	 */

	public static enum Occurance {
		ONETIME, DAILY, MONTHLY;
	}
	Occurance type;
	/*
	 * Creates an enum Occurance for the different types
	 * of appointments that exist in the appointment book.
	 */

	public void addAppt(Occurance type, String desc, int year, int month, int day) {
		
		if (type.equals(Occurance.ONETIME)) {
			Onetime onetime = new Onetime(desc, year, month, day);
			data.add(onetime);
		}
		
		if (type.equals(Occurance.DAILY)) {
			Daily daily = new Daily(desc, year, month, day);
			data.add(daily);
		
		}
		if (type.equals(Occurance.MONTHLY)) {
			Monthly monthly = new Monthly(desc, year, month, day);
			data.add(monthly);
		}
	}
	/*
	 * The addAppt method will take in the required information that
	 * is used for an appointment and will create a new appointment 
	 * object of the type specified. It will then add that appointment
	 * object to the ArrayList created earlier.
	 */

	public void load(String filename) throws FileNotFoundException, IOException{
		Scanner checker = new Scanner(new File(filename));
		while (checker.hasNextLine()) {
			String type = checker.nextLine();
		
			if (type.equals("ONETIME")) {
				String monthLoad = checker.next();
				String dateLoad = checker.next();
				String yearLoad = checker.next();
				
				checker.nextLine(); // Jump down a line
				String desc = checker.nextLine();
				int month = Integer.parseInt(monthLoad);
				int day = Integer.parseInt(dateLoad);
				int year = Integer.parseInt(yearLoad);
			
				addAppt(Occurance.ONETIME, desc, year, day, month);
			}
			
			if (type.equals("DAILY")) {
				String monthLoad = checker.next();
				String dateLoad = checker.next();
				String yearLoad = checker.next();
				checker.nextLine();
				String desc = checker.nextLine();
				int month = Integer.parseInt(monthLoad);
				int day = Integer.parseInt(dateLoad);
				int year = Integer.parseInt(yearLoad);
				
				addAppt(Occurance.DAILY, desc, year, day, month);
			}
			
			if (type.equals("MONTHLY")) {
				String monthLoad = checker.next();
				String dateLoad = checker.next();
				String yearLoad = checker.next();
				checker.nextLine();
				String desc = checker.nextLine();
				int month = Integer.parseInt(monthLoad);
				int day = Integer.parseInt(dateLoad);
				int year = Integer.parseInt(yearLoad);
				
				addAppt(Occurance.MONTHLY, desc, year, day, month);
			}
		}
		checker.close();
	}
	/*
	 * The load method takes a specified file and loads the
	 * content into the arraylist. It reads each line of the
	 * file to resolve parts of the data that are needed to
	 * construct a new appointment. If the file is not found
	 * an exception will be thrown.
	 */

	public void save(Appointment a, String filename) throws IOException {
		File info = new File(filename);
		PrintWriter writer = new PrintWriter(new FileWriter(info, true)); 
		writer.write("" + a);
		writer.close();
	}
	/*
	 * Saves an appointment to a filename that is sent
	 * as a string by the user of the file. This method will not
	 * overwrite any data written previously. In the event that
	 * valid input is not sent, an IOException will be thrown. Only
	 * saves an individual appointment per the instructions of the project.
	 */
}