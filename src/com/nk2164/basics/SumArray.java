package com.nk2164.basics;

public class SumArray {

	public static void main(String[] args) {
		int[] array = {21,82,85,8,92,43,56,78,37,78};
		int total = 0;
		
		for (int j=0;j<array.length;j++) {
			total+=array[j];
		}
		
		System.out.printf("The sum of the integers is %d%n", total);
		
	}

}
