// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: February 28th, 2017
// Filename: EmployeeTest.java
// Description: Tests the Employee, Manager,
// and the Executive classes
public class EmployeeTest {

	public static void main(String[] args) {

		Employee test = new Employee("Ben", 200000);
		System.out.println("Expected: Name: Ben Salary: 200000.0");
		System.out.println(test.toString());
		// Creates a new employee with a name and salary

		Manager tester = new Manager("Ben", 200000, "Phone Support");
		System.out.println("Expected: Name: Ben Salary: 200000.0 Department: Phone Support");
		System.out.println(tester.toString());
		// Creates a manager with a name, salary, and title

		Executive Ben = new Executive("Ben", 200000, "CEO", "New York City");
		System.out.println("Expected: Name: Ben Salary: 200000.0 Department: Phone Support Location: New York City");
		System.out.println(Ben.toString());
		// Creates an executive with name, salary, title, and location of office
	}
}