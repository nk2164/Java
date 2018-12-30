package com.nk2164.algorithms;

public class Factorial {
	
	// Note: For recursion to work, 2 properties must hold
	// 1) There must be one or more base cases where we compute 
    //	  the solution without any recursion.
	// 2) Each recursive call must be to a smaller instance of the 
	//    same problem eventually reaching the base case.

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(0));
	}
	
	private static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

}
