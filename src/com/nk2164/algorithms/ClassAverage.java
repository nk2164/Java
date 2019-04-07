package com.nk2164.algorithms;

import java.util.Scanner;

public class ClassAverage {
	public static void main(String... args) {
		// Create scanner to obtain input from command window
		Scanner input = new Scanner(System.in);

		// initialization phase
		int total = 0;
		int gradeCounter = 1;

		while (gradeCounter <= 10) // loop 10 times
		{
			System.out.print("Enter grade: ");
			int grade = input.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
		}

		// compute average
		int average = total/10;
				
		// display total and average of grades
		System.out.printf("%nTotal of all 10 grades is %d%n", total);
		System.out.printf("Class average is %d%n", average);
		
	} // end main
} // end class ClassAverage
