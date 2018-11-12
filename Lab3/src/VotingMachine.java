// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: February 10th, 2017
// Filename: VotingMachine.java
// Description: Create a voting machine
package lab03;

public class VotingMachine {

	private int r = 0;
	private int d = 0;

	public void clear() {
		// Reset variables
		r = 0;
		d = 0;
	}
	public void addR() {
		// Add to republican vote
		r++;
	}
	public void addD() {
		// Add to democrat vote
		d++;
	}
	public void total() {
		// Print out total
		System.out.println("Republicans: " + r + " " + "Democrats: " + d);
	}
}