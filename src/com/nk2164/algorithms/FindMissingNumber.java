/* This will only work for an array with one missing number */

package com.nk2164.algorithms;

import java.util.Arrays;

public class FindMissingNumber {
	public static void main(String[] args) {

		int[] numArray = { 1, 3, 4}; //Missing 9
		int arrayLength = 4;

		getMissingNum(numArray,arrayLength);
	}

	private static void getMissingNum(int[] numArray,int arraySize) {
		int numTotal = 0;
		int missingNum = 0;

		for (int i : numArray) {
			numTotal += i;
		}
		
		missingNum = (arraySize * (arraySize+1)/2)-numTotal;
		
		System.out.println("The array input is "+Arrays.toString(numArray));
		System.out.println("The missing number is : " + missingNum);
	}

}
