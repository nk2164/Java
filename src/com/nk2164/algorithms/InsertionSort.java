package com.nk2164.algorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] a = { 12, 9, 3, 7, 14, 11 };
		System.out.println(Arrays.toString(insertionSort(a, a.length - 1)));

	}

	private static int[] insertionSort(int[] a, int n) {
		int key = 0, j = 0;
		for (int i = 1; i <= n; i++) {
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j = j - 1;
				a[j + 1] = key;
			}

		}
		return a;
	}

}
