// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: February 28th, 2017
// Filename: PersonTesters.java
// Description: Tests the person, student,
// and the instructor classes.
public class PersonTesters {

	public static void main(String[] args) {

		Person test = new Person("Ben", 1995);
		System.out.println("Expected: Name: Ben Year of Birth: 1995");
		System.out.println(test.toString());
		// Creates a new person and passes a name and year
		
		Student tester = new Student("Ben", 1995, "CSE");
		System.out.println("Expected: Name: Ben Year of Birth: 1995 Major: CSE");
		System.out.println(tester.toString());
		// Creates a new student and tests name, year, and major
		
		Instructor Ben = new Instructor("Ben", 1995, 102000);
		System.out.println("Expected: Name: Ben Year of Birth: 1995 Major: CSE Salary: 102000.0");
		System.out.println(Ben.toString());
		// Creates a new instructor, tests name, year, and salary
	}
}