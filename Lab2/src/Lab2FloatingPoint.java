// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: February 3rd, 2017
// Filename: Lab2FloatingPoint.java
// Description: Prompt the user for floating numbers
// and stop and compute sum after two non-float characters.
import java.util.Scanner;

public class Lab2FloatingPoint {

	public static void main(String[] args) {

		int error = 0;
		float sum = 0;
		// Creates variables for number of errors and sum

		while(error < 2) {
			try {
				Scanner data = new Scanner(System.in);
				System.out.println("Enter float numbers: ");
				sum += data.nextFloat();
				error = 0;
				// Errors reset to zero if next value is valid
			}
			catch (Exception e) {
				error++;
				// Increases the error counter above
			}
		}
		System.out.println("Sum: " +sum);
		// Display the sum after two non-float characters
	}
}