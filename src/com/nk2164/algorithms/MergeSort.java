package com.nk2164.algorithms;

import java.util.Arrays;

// This Merge sort procedure will sort an integer array and print the sorted output. 
// Limitation: Cannot sort an array containing the integer max value(2147483647) since
//             I am using it as the sentinel. 

public class MergeSort {

	public static void main(String[] args) {
		
		int[] A = {12,9,3,7,14,11,6,2,10,5,1,4};
		System.out.println(Arrays.toString(mergeSort(A, 0, A.length-1)));
		
	}

	private static int[] mergeSort(int[] A,int p,int r) {
		if(p >= r) {
			return A; //Base case: I return without doing anything.
		}
		else {
			int q = (p+r)/2; //Get the mid point.
			mergeSort(A, p, q);
			mergeSort(A, q+1, r);
			return merge(A, p, q, r);
		}
	}
	
	private static int[] merge(int[] A,int p,int q,int r) {
		int n1 = (q-p)+1, n2 = r-q;
		
		int[] b = new int[n1+1]; // Declare the array, +1 is for sentinel.
		int[] c = new int[n2+1]; // Declare the array, +1 is for sentinel.
		
		System.arraycopy(A, p, b, 0, n1);
		System.arraycopy(A, q+1, c, 0, n2);
		
		b[b.length-1] = Integer.MAX_VALUE; // use Integer max value as sentinel.
		c[c.length-1] = Integer.MAX_VALUE; // use Integer max value as sentinel.

		int i = 0, j = 0;
		
		for (int k = p; k <= r; k++) {
			if(b[i] <= c[j]) {
				A[k] = b[i];
				i++;
			}else { 
				A[k] = c[j];
				j++;
			}
		}
		
		return A; //All Done, Return Sorted array A[p...r];
	}
	
}
