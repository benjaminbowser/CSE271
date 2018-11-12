// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: March 29th, 2017
// Filename: Student.java
// Description: Adds GPA and major for
// a student from person
package edu.miamioh.bowserbl;

import java.util.ArrayList;

/**
 * @author bowserbl
 *
 */
public class Student extends Person {

	private double gpa;
	private String major;
	private ArrayList<Course> list = new ArrayList<Course>();

	public Student(int identifier, String email, double GPA, String major) {
		super(identifier, email);
		this.gpa = GPA;
		this.major = major;
		// TODO Auto-generated constructor stub
	}

	/**
	@return Double value of student GPA
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	Set student GPA
	@param gpa Double value for GPA
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	/**
	@return String of major
	 */
	public String getMajor() {
		return major;
	}

	/**
	Set student major
	@param major String for student major
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	Get a list of courses a student is in
	@return String from arraylist of courses enrolled
	 */
	public String getList() {
		return list.toString();
	}

	/**
	Enrolls a student in a course
	@param course Course object
	 */
	public void enroll(Course course) {
		list.add(course);
	}

	/**
	@return Super toString from people with the addition of Major & GPA
	 */
	public String toString() {
		return super.toString() + "Major: " + major + "\nGPA: " + gpa + "\n";
	}
}