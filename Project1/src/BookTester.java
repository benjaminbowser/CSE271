// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: March 10th, 2017
// Filename: BookTester.java
// Description: This class tests the appointment
// and appointment book classes based on the requested
// instructions listed in the project PDF.
import java.util.Scanner;

public class BookTester {

	public static void main(String[] args) {
		AppointmentBook school = new AppointmentBook();

		/*
		 * Creates a new AppointmentBook object to store the
		 * appointments we create in.
		 */
		
		school.addAppt(AppointmentBook.Occurance.DAILY, "Call Parents", 2017, 9, 2);
		school.addAppt(AppointmentBook.Occurance.MONTHLY, "Pay Rent", 2017, 8, 1);
		school.addAppt(AppointmentBook.Occurance.ONETIME, "CSE271 Midterm", 2017, 3, 13);
		school.addAppt(AppointmentBook.Occurance.ONETIME, "Start CSE274", 2017, 6, 26);
		school.addAppt(AppointmentBook.Occurance.MONTHLY, "Doctors Appointment", 2018, 1, 1);
		
		/*
		 * Uses the AppointmentBook called school with the method called
		 * addAppt to pass data which creates a new appointment object to
		 * the type that is specified by the enum. It then adds the newly
		 * created appointment to the ArrayList specified in AppointmentBook
		 */
		
		Scanner checker = new Scanner(System.in);
		int month, day, year;
		System.out.println("Enter a month in terms of an integer:");
		month = checker.nextInt();
		System.out.println("Enter a day in terms of an integer:");
		day = checker.nextInt();
		System.out.println("Enter a year in terms of an integer:");
		year = checker.nextInt();

		for (Appointment a : AppointmentBook.getData()){  
			if (a.occursOn(year, month, day)) {
				System.out.println("There is an event occuring on "+ month +"/" + day + "/" + year +" starting on " +a);
			}
		}
		checker.close();
		/*
		 * A simple section of code that creates a new scanner to get input
		 * from the keyboard, asking the user for integer values for month,
		 * day, and year. Once these numbers have been stored as integers,
		 * a for each loop uses the getter from AppointmentBook to grab the
		 * ArrayList check the appointments stored in it. If an event is set
		 * to occur on the date the user entered, it will return the date of
		 * the event and the description.
		 */
	}
}
