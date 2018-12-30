package com.nk2164.algorithms;

public class RecursiveLinearSearch {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(recursiveLinearSearch(a, a.length - 1, 0, 1));
		System.out.println(recursiveLinearSearch(a, a.length - 1, 0, 5));
		System.out.println(recursiveLinearSearch(a, a.length - 1, 0, 8));
	}

	private static String recursiveLinearSearch(int[] a, int n, int i, int x) {
		if (i > n) {
			return "Not-found";
		} else {
			if (a[i] == x) {
				return "String was found in index " + i;
			} else {
				return recursiveLinearSearch(a, n, i + 1, x);
			}
		}
	}

}
