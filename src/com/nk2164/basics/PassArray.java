package com.nk2164.basics;

public class PassArray {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		System.out.printf("Effects of passing reference to entire array:%n" +
					      "The value of the original array are:%n");
		
		for (int value:array) {
			System.out.printf("  %d",value);
		}
		
		modifyArray(array);
		System.out.printf("The value of the modified array is ", args);
		
		for (int value:array) {
			System.out.printf("  %d",value);
		}
	}

}
