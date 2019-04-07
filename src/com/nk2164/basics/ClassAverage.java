package com.nk2164.basics;

import java.util.Scanner;

public class ClassAverage {
  
 public static void main(String... args) {
	 //declare the scanner.
	 Scanner input = new Scanner(System.in);
	 
	 //initialization phase
	 int total = 0;
	 int gradeCounter = 0;
	 
	 // processing phase
	 System.out.print("Enter the numeric grade or -1 to quit: ");
	 int grade = input.nextInt();
	 
	 while(grade != -1){
		total = total + grade;
		gradeCounter = gradeCounter + 1; 
		
		System.out.print("Enter the numeric grade or -1 to quit: ");
		grade = input.nextInt();
	 }
	
	if (gradeCounter != 0) {
	 System.out.printf("%nThe total of %d grade is %d%n", gradeCounter, total);
	 System.out.printf("The Class average is %.2f%n" , (double) total/gradeCounter);
	}
	else {
	 System.out.println("No grades were entered");	
	}
 }	
}