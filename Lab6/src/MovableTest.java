// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: March 3rd, 2017
// Filename: MovableTest.java
// Description: Class for testing 
// objects and method created below
package lab06;

public class MovableTest {

	public static void main(String[] args) {

		Movable m1 = new MovablePoint(5, 6, 10, 12); // upcast
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		Movable m2 = new MovableCircle(2, 1, 2, 20,50); // upcast. Constructor takes in 4 point values and
		//radius
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);
		
		Movable m3 = new MovablePoint(0, 0, 2, 2);
		m3.moveDown();
		m3.moveRight();
		System.out.println(m3);
		
		Movable m4 = new MovablePoint(100, 100, 50, 50);
		m4.moveDown();
		m4.moveLeft();
		System.out.println(m4);

		Movable slide1 = new MovableCircle(1, 1, 2, 40, 20);
		Movable slide2 = new MovablePoint(0, 0, 2, 1);
		Movable slide3 = new MovableCircle(9, 2, 4, 15, 40);
		Movable slide4 = new MovablePoint(2, 7, 2, 5);
		Movable[] slide = {slide1, slide2, slide3, slide4};

		chaChaSlide(slide);
		System.out.println(slide1);
		System.out.println(slide2);
		System.out.println(slide3);
		System.out.println(slide4);
	} 

	public static void chaChaSlide(Movable[] slide)  {
		for (Movable obj : slide) {
			obj.moveLeft();
			obj.moveRight();
			obj.moveDown();
			obj.moveUp();
			obj.moveLeft();
			obj.moveDown();
			obj.moveUp();
			obj.moveRight();
			obj.moveLeft();
			obj.moveDown();
			obj.moveUp();
			obj.moveUp();
		}
	}
}