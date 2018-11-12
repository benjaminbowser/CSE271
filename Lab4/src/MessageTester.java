// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: February 22nd, 2017
// Filename: MessageTester.java
// Description: Uses the Mailbox class
// to test methods inside
public class MessageTester {

	public static void main(String[] args) {

		Message test = new Message("Harry Morgan", "Rudolf Reindeer");
		test.Append("Hello!");
		test.Append("Tester");
		// Add text to message
		System.out.println(test.toString());
		// Display message

		System.out.println("Expected:");
		System.out.println("From: Harry Morgan\nTo: Rudolf Reindeer\nHello!\nTester \n");
		// Displays expected message based on text inputted above.
	}
}