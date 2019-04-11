package com.nk2164.basics;

public class DoWhileTest {
	
	public static void main(String[] args) {
		int counter = 1;
		
		String test = "init";
		test = "changed";
		System.out.println(test);
		
		do
		{
			System.out.printf("%d %n",counter);
			++counter;
		} while(counter <= 10);
		
		System.out.println();
	}

} // end class do while.