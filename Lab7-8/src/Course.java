// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: March 29th, 2017
// Filename: Course.java
// Description: Course object class with arraylists
// to manage students, instructor, and location
package edu.miamioh.bowserbl;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author bowserbl
 *
 */
public class Course {
	private ArrayList<Student> enrolled = new ArrayList<Student>();
	private LectureHall[] location = new LectureHall[1];
	private Instructor[] person = new Instructor[1];
	String desc = "";
	
	public Course(String desc) {
		this.desc = desc;
	}
	// In order to identify the courses, a description string was added
	
	/**
	@return ArrayList of Students enrolled in course
	 */
	public ArrayList<Student> getStudents() {
		return enrolled;
	}
	
	/**
	 Adds a student to a course
	@param Student Student Object
	 */
	public void addStudent(Student student) {
		enrolled.add(student);
	}

	/**
	Assigns a course to a Lecture Hall
	@param LectureHall Lecture Hall Object
	 */
	public void assignLocation(LectureHall lecturehall) {
		location[0] = lecturehall;
	}
	
	/**
	Assigns a course to an instructor
	@param Instructor Instructor Object
	 */
	public void assignInstructor(Instructor instructor) {
		person[0] = instructor;
	}

	/**
	Returns the location of the course
	@return String of the Course location
	 */
	public String getLocation() {
		return Arrays.deepToString(location);
	}

	/**
	Returns the instructor assigned to the course
	@return String of the instructor name
	 */
	public String getPerson() {
		return Arrays.deepToString(person);
	}
	
	/**
	Returns the name of the course
	@return String of the course name
	 */
	public String toString() {
		return desc;
	}	
}