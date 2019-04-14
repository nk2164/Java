package com.nk2164.basics;

public class InitArray {
	public static void main(String[] args) {
//		int[] intArray = new int[10];

		int[] intArray = {21,22,23,45,67,89,34,56,7,8,9};

		System.out.printf("%s%8s%n", "Index","Value"); //Column headings
		
		for(int counter = 0;counter < intArray.length;counter++) {
			
			System.out.printf("%5d%8d%n", counter,intArray[counter]);

		}
	}
}
