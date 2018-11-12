// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: February 22nd, 2017
// Filename: Message.java
// Description: Creates a message framework that
// will be used to pass messages along to the
// mailbox class later on
public class Message {

	private String recipient;
	private String body = "";
	private String sender;
	// Create strings for message

	public Message(String sender, String recipient) {
		this.recipient = recipient;
		this.sender = sender;
		// Build constructor
	}
	public void Append(String text) {
		this.body += text + "\n";
		// Add text to the message
	}

	public String toString() {
		// Override toString class
		return "From: " +sender + "\nTo: " + recipient + "\n" + this.body;
	}
}