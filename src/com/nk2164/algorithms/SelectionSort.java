package com.nk2164.algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] a = {2,4,5,1,6,3,7,8,9};
		
		System.out.println("Before Sort :" + Arrays.toString(a));
		
		a = selectionSort(a, a.length-1);
		
		System.out.println("After  Sort :" + Arrays.toString(a));

	}

	private static int[] selectionSort(int[] a,int n) {
		// declare an array to be returned.
		int smallest = 0,temp = 0;
				
		for (int i = 0; i < n-1; i++) {
			smallest = i; // Set smallest to i
			for (int j = i+1; j < a.length; j++) {
				if(a[j] < a[smallest]) {
					smallest = j;
				}
			}
			// Swapping a[i] with a[smallest] 
			
			temp = a[i];
			a[i] = a[smallest];
			a[smallest] = temp;
		}
		
		return a;
	}

}
