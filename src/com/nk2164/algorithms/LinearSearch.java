package com.nk2164.algorithms;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		System.out.println(linearSearch(a1, 5));
		System.out.println(sentinalSearch(a1, 2));
		System.out.println(linearSearch(a1, 6));
		System.out.println(sentinalSearch(a1, 8));
	}

	private static String linearSearch(int[] intArray, int intToFind) {
		String answer = "String " + intToFind + " was Not-found";

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == intToFind) {
				answer = "String " + intToFind + " was found in position " + i;
				return answer;
			}
		}

		return answer;
	}
	
	private static String sentinalSearch(int[] intArray, int intToFind) {
		String answer = "String " + intToFind + " was Not-found"; 
		int i = 0;
		//First save the last element in a variable called last
		// and then replace the last element of the array with intToFind
		int last = intArray[intArray.length-1];
		intArray[intArray.length-1] = intToFind;
		
		while (intArray[i] != intToFind) {
			i++; // increment i
		}
		// restore the last element back
		intArray[intArray.length-1] = last;
		
		// now if i is less than the last element in the array or if the last elemetn is the
		// element you are looking for, then return it.
		if((i < intArray.length-1) || (intToFind == intArray[intArray.length-1])) {
			answer = "String " + intToFind + " was found in position " + i;
		}

		return answer;
	}

}
