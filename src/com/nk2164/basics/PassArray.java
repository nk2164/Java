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
		
		System.out.println();
		
		System.out.printf("The value of the modified array is %n", args);
		
		for (int value:array) {
			System.out.printf("  %d",value);
		}

		System.out.println();
		
		modifyVar(array[3]);
		
		System.out.printf("The value of array[3] after call into modify var proc is %d %n", array[3]);
		
	}
	
	public static void modifyArray(int[] array) {
		for (int i=0;i < array.length;i++) {
			array[i] *= 2;
		}
	}
	
	public static void modifyVar(int var) {
			var *= 2;
			System.out.printf("%nThe value of var inside method is %d %n", var);
	}
	

}
