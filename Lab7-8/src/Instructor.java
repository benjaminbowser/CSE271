// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: March 29th, 2017
// Filename: Instructor.java
// Description: Instructor object with salary
// added from person

package edu.miamioh.bowserbl;

import java.util.ArrayList;

/**
 * @author bowserbl
 *
 */
public class Instructor extends Person {
	private ArrayList<Course> list = new ArrayList<Course>();
	double salary;

	public Instructor(int identifier, String email, double salary) {
		super(identifier, email);
		this.salary = salary;
	}

	/**
	Adds a course to list of instructors classes being taught
	@param course Course object
	 */
	public void add(Course course) {
		list.add(course);
	}

	/**
	Gets list of courses an instrutor is assigned to
	@return ArrayList of courses instructor teaches
	 */
	public ArrayList<Course> retrieveList() {
		return list;
	}

	/**
	Changes student GPA
	@param student Student object
	@param GPA Double value for GPA
	 */
	public void changeGPA(Student student, double GPA) {
		student.setGpa(GPA);
	}
	
	/**
	@return Super toString with added salary
	 */
	public String toString() {
		return super.toString() + "Salary: " + salary;
	}
}