package com.nk2164.algorithms;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] A = { 12, 9, 3, 7, 14, 11, 6, 2, 10, 5, 1, 4 };
		System.out.println(Arrays.toString(quickSort(A, 0, A.length - 1)));
	}

	private static int[] quickSort(int[] A,int p,int r) {
		if(p >= r) {
			return A;
		}
		else {
			int q = partition(A, p, r);
			quickSort(A, p, q-1);
			quickSort(A, q+1, r);
			return A;
		}
	}
	
	private static int partition(int[] A,int p,int r) {
		int q = p , temp = 0;
		
		for (int u = p; u < r; u++) {
			if(A[u] <= A[r]) {
				temp = A[q];
				A[q] = A[u];
				A[u] = temp;
				q++;
			}
		}
		
		temp = A[q];
		A[q] = A[r];
		A[r] = temp;
		
		return q;
	}
}