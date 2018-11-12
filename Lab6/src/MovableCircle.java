// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: March 3rd, 2017
// Filename: MovableCircle.java
// Description: Creates a class for moving points
// around based on x,y and their speeds
package lab06;

public class MovableCircle extends MovablePoint {
	
	private int radius;
	// Creates int for radius
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		super(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	// Creates a constructor
	
	public String toString() {
		return super.toString() + " Radius: " + this.radius;
	}
	// Override toString
}