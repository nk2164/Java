package com.nk2164.basics;

public class ArrayTest {
	
	public static void main(String[] args) {
		int[] aI = {1,2,3,4};
		int[] aI2 = new int[10];
		
		System.arraycopy(aI, 0, aI2, 0, aI.length);
		
		for (int a : aI2) {
			System.out.println(a);
		}

		int  iaa[][] = {
				{1,2,3,4,},
				{5,6,7,8,9,10,},
				{11,12,13,14,}
		};
		
		for (int[] intArray : iaa) {
			
		  for (int j : intArray) {
			System.out.println(j);  
		  };
		  
		};
		
	}

}
