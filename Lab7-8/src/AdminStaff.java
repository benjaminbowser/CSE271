// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: March 29th, 2017
// Filename: AdminStaff.java
// Description: AdminStaff user which extends Person
// with escalated user privileges
package edu.miamioh.bowserbl;

/**
 * @author bowserbl
 *
 */
public class AdminStaff extends Person {

	public AdminStaff(int identifier, String email, double salary) {
		super(identifier, email);
		// TODO Auto-generated constructor stub
	}
	
	/**
	Enrolls a student in a course
	@param student Student object
	@param course Course object
	 */
	public void enroll(Student student, Course course) {
		course.addStudent(student);
		student.enroll(course);
	}

	/**
	Assigns a course a lecturehall location 
	@param course Course object
	@param lecturehall LectureHall object
	 */
	public void assignLocation(Course course, LectureHall lecturehall) {
		course.assignLocation(lecturehall);
	}
	
	/**
 	Assigns an instructor to teach a course
 	@param course Course object
	@param instructor Instructor object
	 */
	public void assignInstructor(Course course, Instructor instructor) {
		course.assignInstructor(instructor);
		instructor.add(course);
	}
}