// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: February 22nd, 2017
// Filename: MailboxTester.java
// Description: Uses the Mailbox class
// to test methods inside
public class MailboxTester {

	public static void main(String[] args) {

		Mailbox tester = new Mailbox("Harry Morgan - CEO");
		Message test = new Message("Harry Morgan", "Rudolf Reindeer");
		test.Append("Hello! This is test text! I hope you have a great day!");
        // Adds this text to the Message
		tester.addMessage(test);
		// Adds the message to mailbox created above
		
		System.out.println(tester.getMessage(0));
		// Prints out mailbox at position 0
		
		System.out.println("Expected:");
		System.out.println("From: Harry Morgan\nTo: Rudolf Reindeer\nHello! This is a test text! I hope you have a great day!\nHarry Morgan - CEO");
		tester.removeMessage(0);
		// Removes the message at position 0
	}
}
