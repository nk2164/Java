package com.nk2164.algorithms;

public class SwapNumbers {

	public static void main(String[] args) {
		int x = 20;
		int y = 10;
		System.out.println("Before Swapping, X="+x+" and Y="+y);
		x = x+y;  // x = 20 + 10 = 30
		y = x-y;  // y = 30 - 10 = 20
		x = x-y;  // x = 30 - 20 = 10
		System.out.println("After Swapping, X="+x+" and Y="+y);		

	}

}
