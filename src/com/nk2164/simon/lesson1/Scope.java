package com.nk2164.simon.lesson1;

public class Scope {
	private static int y = 99;
	
	public static void main(String[] args) {
		int x = y;
		
		{
//			x =d;
			int j = 100;
			System.out.println("Value of j is " + j + " and x is " + x);
			int d = 100;
			x = d;
		}
		
//		System.out.println("Value of j is " + j);
//		System.out.println("Value of d is " + d);
		System.out.println("Value of x is " + x);
	}
}
