// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: March 29th, 2017
// Filename: GUI.java
// Description: Creates a frame GUI for course
// registration. Proof of concept.
package edu.miamioh.bowserbl;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		JButton masterCourse = new JButton("Course List");
		JButton masterLecture = new JButton("LectureHall List");
		JButton masterStudent = new JButton("Student List");
		JButton masterInstructor = new JButton("Instructor List");
		JButton masterAdmin = new JButton("AdminStaff List");
		
		panel.add(masterCourse);
		panel.add(masterLecture);
		panel.add(masterStudent);
		panel.add(masterInstructor);
		panel.add(masterAdmin);
		
		frame.add(panel);

		final int FRAME_WIDTH = 700;
		final int FRAME_HEIGHT = 450;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Course Registration Manager");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}