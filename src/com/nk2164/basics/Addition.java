package com.nk2164.basics;

import java.util.Scanner;

public class Addition {
	
	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		int number1 = 0; // first number to add
		int number2 = 0; // second number to add
		String dataInput;
		int sum; 	 // sum of number1 and number2
		boolean done = false;
		
		while(!done) {
			System.out.print("Enter first intger: ");  //prompt
			dataInput = input.next(); // read first number from user
		    try {
		        number1 = Integer.parseInt( dataInput );
		        done = true;
		    }
		    catch( Exception e ) {
		    	System.out.println("That was not numeric, try again");
		        done = false;
		    }
		}
		
		done = false;
		
		while(!done) {
			System.out.print("Enter second intger: ");  //prompt
			dataInput = input.next(); // read first number from user
		    try {
		    	number2 = Integer.parseInt( dataInput );
		        done = true;
		    }
		    catch( Exception e ) {
		    	System.out.println("That was not numeric, try again");
		        done = false;
		    }
		}		
		
		sum = number1 + number2; // add these 2 together
		
		System.out.printf("The sum is %d%n ", sum);
	}
}
