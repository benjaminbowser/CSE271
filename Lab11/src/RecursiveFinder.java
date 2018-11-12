// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: April 25th, 2017
// Filename: RecursiveFinder.java
// Description: Takes an array of numbers and
// returns the largest value with recursion.
package edu.miamioh.bowserbl;

import java.util.Arrays;

public class RecursiveFinder {

	public static void main(String[] args) {
		int[] first = {1, 10, 3, 2, 21, 6, 7, 12, 9};
		int[] second = {1, 2, 3, 20, 2, 4, 5, 99, 12, 18, 20, -100};
		int[] third = {900, 3293238, 32932, 11, 359560688, 3829, 324243, 59062, 4859201, 201, 1, 5, 9000, 24};
		int[] fourth = {1};

		System.out.println(largestElement(first));
		System.out.println(largestElement(second));
		System.out.println(largestElement(third));
		System.out.println(largestElement(fourth));
	}

	/**
	 * Takes an array of integers and returns the
	 * largest value using recursion.
	 *
	 * @param data Integer array
	 * @return int
	 */
	public static int largestElement(int[] data){
		int length = data.length;

		if (length == 1){
			return data[0];
			// Array w/1 element
		} 
		else {
			int x = largestElement(Arrays.copyOf(data, length - 1));

			if (x > data[length - 1]){
				return x;
			} 
			else {
				return data[length - 1];
			}
		}       
	}
}