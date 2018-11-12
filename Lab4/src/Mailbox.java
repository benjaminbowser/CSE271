// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: January 22nd, 2017
// Filename: Mailbox.java
// Description: Creates a mailbox to store
// messages from the Message class.

import java.util.ArrayList;

public class Mailbox {

	private final String signature;
	private ArrayList<Message> mail;
	// Create final string and arraylist
	
	public Mailbox(String signature) {
		this.signature = signature;
		this.mail = new ArrayList<Message>();
		// Create constructor
		
	}
	public void addMessage (Message m) {
		mail.add(m);
		m.Append(signature);
		// Add a message to the arraylist with the signature
		// added to each message that is written
	
	}
	public Message getMessage(int i) {
		return this.mail.get(i);
		// Returns the message in the arraylist at location i
		
	}
	public void removeMessage(int i) {
		mail.remove(i);
		// Removes the message in the arraylist at location i
	
	}
}