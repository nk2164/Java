package com.nk2164.algorithms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int howManyToPrint = 10;
		int i = 1;
				
		while (i <= howManyToPrint) {
			System.out.println(fib(i));
			i += 1;
		}
		
	}
	
	static int count, numToPrint = 0;
	
	public static int fib(int n) {
		
		if (n >= 3) {
			numToPrint = fib(n-1) + fib(n-2);
		}
		else {
			numToPrint = 1;
		}
		
		return numToPrint;	
	}

}
