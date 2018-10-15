package com.nk2164.basics;

public class BasicsDemo {

	private static void typeCasting() {
		System.out.println("\nInside typeCasting");
		// Explicit casting
		long y = 42;
		// int x = y;
		int x = (int) y;

		// Information loss due to out of range assignment.
		byte narrowdByte = (byte) 123456;
		System.out.println("narrowd byte " + narrowdByte);

		// Truncation
		int iTruncated = (int) 0.99;
		System.out.println("iTruncated: " + iTruncated);

		// Implicit cast (int to long)
		y = x;

		// Implicit cast (char to int)
		char cChar = 'A';
		int iInt = cChar;
		System.out.println("iInt: " + iInt);

		// byte to char using explicit cast
		byte bByte = 65;
		cChar = (char) bByte; // bByte first converts from byte to int (widening) and then narrows
								// from int to char.
		System.out.println("cChar " + cChar);

		// int[] myArray = new int[7];
		int[] myArray = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(myArray.length);

	}

	private static void arrays() {
		System.out.println("\nInside Arrays");
		int[] myArray = new int[] { 9, 11, 2, 5, 4, 4, 6 };

		System.out.println("myArray.length : " + myArray.length);
		System.out.println("myArray[1] : " + myArray[1]);

	}

	public static void main(String[] args) {
		// typeCasting();
		arrays();
	}

}
