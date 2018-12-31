package com.nk2164.algorithms;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] a = { 9, 5, 6, 6, 7, 1, 2, 8, 3, 1 };
		Arrays.sort(a);
		System.out.println(binarySearch(a, a.length - 1, 13));
	}

	private static String binarySearch(int[] a, int n, int x) {
		String answer = "Not-found";
		int p = 1, r = n, q = 0; // Local variables.
		while (p <= r) {
			q = (p + r) / 2; // Get the mid point.

			if(a[q] == x) {
				return "The variable " + x + " is found in array";
			}
			else if (a[q] > x){
				r = q-1;
			}
			else {
				p = q+1;
			}
		}
		return answer;
	}

}
