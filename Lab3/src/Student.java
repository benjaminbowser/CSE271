// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: February 10th, 2017
// Filename: Student.java
// Description: Student quiz score program
package lab03;

public class Student {

	private String name;
	private int totalScore;
	private int quizCount = 0;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addQuiz(int score) {
		// Add a quiz to the count by adding to total
		// if valid and increasing the quiz count by 1 
		if (score < 0 || score > 100) {
			score = 0;
		}
		else {
			totalScore = totalScore + score;
			quizCount++;
		}
		}
	
	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	public int getAverageScore() {
		// Returns the average by using formula for average
		return totalScore / quizCount;
	}
}
