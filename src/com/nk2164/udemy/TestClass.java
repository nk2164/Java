package com.nk2164.udemy;

public class TestClass {

	public static void main(String[] args) {
		int x = 0;
		
		label: if (x == 0) {
			System.out.println("i'm out of here");
			break label;
		}

	}

}
