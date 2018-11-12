// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: March 29th, 2017
// Filename: Tester.java
// Description: Tester class to execute tasks
// that are apart of the course registration system.
package edu.miamioh.bowserbl;

public class Tester {

	public static void main(String[] args) {

		Student Ben = new Student(1, "bowserbl@miamioh.edu", 3.5, "Computer Science");
		Student Matt = new Student(2, "Matt@miamioh.edu", 4.0, "Computer Engineering");
		Student Alex = new Student(3, "alex@miamioh.edu", 3.0, "Software Engineering");

		Course CSE = new Course("CSE271");
		Course Intro = new Course("ENG313");
		Course Graduate = new Course("CSE485");

		LectureHall a = new LectureHall(100, "Benton 102");
		LectureHall b = new LectureHall(30, "Bachleor 252");

		Instructor Stephan = new Instructor(4, "mstephan@miamioh.edu", 100000);
		Instructor Krumpe = new Instructor(5, "krumpenj@miamioh.edu", 100000);

		AdminStaff Kiper = new AdminStaff(6, "jkiper@miamioh.edu", 200000);
		// Creates the objects needed for a basic system

		Kiper.assignLocation(CSE, a);
		Kiper.assignLocation(Intro, b);
		Kiper.assignLocation(Graduate, a);
		// Assigns course to a lecture Hall

		Kiper.assignInstructor(CSE, Stephan);
		Kiper.assignInstructor(Intro, Krumpe);
		Kiper.assignInstructor(Graduate, Stephan);
		// Assigns instructor to teach a course

		Kiper.enroll(Ben, CSE);
		Kiper.enroll(Matt, Intro);
		Kiper.enroll(Alex, CSE);
		Kiper.enroll(Matt, Graduate);
		// Enroll students in various courses
		
		Stephan.changeGPA(Ben, 4.0);
		Stephan.changeGPA(Alex, 3.2);
		Krumpe.changeGPA(Matt, 3.5);
		// Change students GPA's

		System.out.println("Print Courses for instructors:\nExpected:");
		System.out.println("[CSE271, CSE485]\n[ENG313]");
		System.out.println("\nActual:");

		System.out.println(Stephan.retrieveList());
		System.out.print(Krumpe.retrieveList());
		// Retrieve lists of course taught

		System.out.println("\n\nPrint Students in classes:\nExpected:");
		System.out.println("[ID: 1\nEmail: bowserbl@miamioh.edu\nMajor: Computer Science\nGPA: 3.5");
		System.out.println(", ID: 3\nEmail: alex@miamioh.edu\nMajor: Software Engineering\nGPA: 3.0]");

		System.out.println("[ID: 2\nEmail: Matt@miamioh.edu\nMajor: Computer Engineering\nGPA: 4.0\n]");
		System.out.println("[ID: 2\nEmail: Matt@miamioh.edu\nMajor: Computer Engineering\nGPA: 4.0\n]");
		System.out.println("\nActual:");

		System.out.println(CSE.getStudents());
		System.out.println(Intro.getStudents());
		System.out.println(Graduate.getStudents());
	}
}