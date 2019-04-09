package com.nk2164.basics;
import java.util.Scanner;
public class MaximumFinder {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter 3 floating point numbers saperated by spaces :");
		
		double number1 = sc.nextDouble();
		double number2 = sc.nextDouble();
		double number3 = sc.nextDouble();
		
		System.out.println("The max number is " + findMax(number1,number2,number3));
	}
	
	private static double findMax(double number1,double number2,double number3) {
		//Set number1 to max to begin with.
		double maxNumber = number1;
		
		if (number2 > maxNumber) {
			maxNumber = number2;
		}
		else if (number3 > maxNumber) {
			maxNumber = number3;
		}
		
		return maxNumber;
	}
}
