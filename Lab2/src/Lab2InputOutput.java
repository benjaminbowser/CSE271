// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: February 3rd, 2017
// Filename: Lab2InputOutput.java
// Description: Takes a text file that is
// specified in the console and writes it out
// to a user specified file and is formatted.
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Lab2InputOutput {

	public static void main (String args[]) throws FileNotFoundException {

		Scanner in = new Scanner(new File(args[0]));
		Scanner console = new Scanner(System.in);


		System.out.println("Output file name: ");
		PrintWriter PW = new PrintWriter(new File(console.next()));

		int line = 1;
		while (in.hasNext()) {
			PW.println("/* " + line + " */ " + in.nextLine());
			line++;
		}
		PW.close();
		in.close();
		console.close();	
		// Close scanners and printwriter
	}	
}