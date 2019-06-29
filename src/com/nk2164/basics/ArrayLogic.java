package com.nk2164.basics;

import java.util.Arrays;

public class ArrayLogic {

	public static void main(String[] args) {
		int[] iArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(Arrays.toString(iArray));

		// reverse the array
		for (int i = 0, j = iArray.length
				- 1, tempNum = 0; j >= i; tempNum = iArray[i], iArray[i] = iArray[j], iArray[j] = tempNum, i++, j--);

			System.out.println(Arrays.toString(iArray));

	}

}
