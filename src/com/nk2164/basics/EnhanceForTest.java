package com.nk2164.basics;

public class EnhanceForTest {

	public static void main(String[] args) {
		Integer[] array = {10,20,30,40,51,60,70,80,90};
		int total = 0;
		
		for(Integer intElement: array) {
			total += intElement.intValue();
		}
		
		System.out.println("The total is :" + total);
	}

}
