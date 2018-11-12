// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: March 3rd, 2017
// Filename: MovablePoint.java
// Description: Creates a class for moving points
// around based on x,y and their speeds
package lab06;

public class MovablePoint implements Movable {

	private int x = 0;
	private int y = 0;
	private int xSpeed = 0;
	private int ySpeed = 0;
	// Create the required ints
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	// Constructor for using class

	public void moveUp() {
		this.y = this.y + this.ySpeed;
	}
	public void moveDown() {
		this.y = this.y - this.ySpeed;
	}
	public void moveLeft() {
		this.x = this.x - this.xSpeed;
	}
	public void moveRight() {
		this.x = this.x + this.xSpeed;
	}
	// Methods for carrying out action

	public String toString() {
		return "X Position: " + x + " " + "Y Position: " + y + " " + "X Speed : " + xSpeed + " " + "Y Speed: " + ySpeed;
	}
	// Overriden toString method

	public int getxSpeed() {
		return Math.abs(xSpeed);
	}
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	public int getySpeed() {
		return Math.abs(ySpeed);
	}
	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	// Required getters and setters
}