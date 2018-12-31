package com.nk2164.algorithms;

import java.util.Arrays;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		Arrays.sort(a);
		// 13 - is the number i want to search.
		
		System.out.println(recursiveBinarySearch(a, 0, a.length-1, 13));
		
		// 1 - is the number i want to search.
		System.out.println(recursiveBinarySearch(a, 0, a.length-1, 1));
	}
	
	private static String recursiveBinarySearch(int[] a,int p,int r,int x) {
		int q = 0;
		if(p > r) {
			return "Integer " + x + " Not-found";
		}
		else {
		 q = (p+r)/2;
		 
		 if(a[q]==x) {
		  return "Integer " + x + " is found";	 
		 }
		 else if (a[q] > x) {
			 return recursiveBinarySearch(a, p, q-1, x);
		 }
		 else {
			return recursiveBinarySearch(a, q+1, r, x); 
		 }
		}
	}
}