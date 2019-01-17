package com.nk2164.basics;

public class BasicsDemo {

	static void varargsOverload(boolean b, int i, int j, int k) {
		System.out.println("Inside varargs method without overload!");
	}
	
	static void varargsOverload(boolean b,int... list) {
		System.out.println("Inside varargs method !" + "1");
		System.out.println("Length of array"+list.length);
	}
	public static void main(String[] args) {
	
		varargsOverload(true, 1, 2,3);
		varargsOverload(false,1, 2, 3, 4, 5, 6);
		varargsOverload(true);
	}

}
