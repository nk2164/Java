package com.nk2164.basics;

public class Increment {
	public static void main(String[] args){
     // demonstrate post fix increment operator
		
	 int c = 5;
	 System.out.printf("c before post increment is: %d%n", c);
	 System.out.printf("c post incrementing : %d%n", c++);
	 System.out.printf("c after postincrement is: %d%n", c);
	
	System.out.println(); //skip a line

	// demonstrate pre fix increment operator

	c = 5;
	 System.out.printf("c before pre increment is: %d%n", c);
	 System.out.printf("c pre incrementing : %d%n", ++c);
	 System.out.printf("c after pre increment is: %d%n", c);
	}
	
}