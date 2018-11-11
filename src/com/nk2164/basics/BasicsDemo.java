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

		int[][] my2DArray = new int[4][2];
		my2DArray[0][0] = 9;
		my2DArray[0][1] = 11;

		my2DArray[1][0] = 2;
		my2DArray[1][1] = 5;

		my2DArray[2][0] = 4;
		my2DArray[2][1] = 4;

		my2DArray[3][0] = 6;
		my2DArray[3][1] = 13;
		
		int[][] myAlt2DArray = new int[][] {{9,11},
											{2,5},
											{4,4},
											{6,13}
											};
											
		int[][] myYA2DArray = new int[4][];
		
		int[] col1 = new int[1];
		int[] col2 = new int[2];
		int[] col3 = new int[3];
		int[] col4 = new int[4];
		
		//1 3 5  8
		//3 4 6  9
		//5 6 7  10 
		//8 9 10 11
		
		col1[0] = 1;
		
		col2[0] = 3;
		col2[1] = 4;
		
		col3[0] = 5;
		col3[1] = 6;
		col3[2] = 7;
		
		col4[0] = 8;
		col4[0] = 9;
		col4[0] = 10;
		col4[0] = 11;
		
		//Assignment
		
		myYA2DArray[0] = col1;
		myYA2DArray[0] = col2;
		myYA2DArray[0] = col3;
		myYA2DArray[0] = col4;
		
		
		
		}


	public static void main(String[] args) {
		// typeCasting();
		arrays();
	}

}
