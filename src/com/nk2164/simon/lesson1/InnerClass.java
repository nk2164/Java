package com.nk2164.simon.lesson1;

public class InnerClass {
	
	static private int x = 10;
	
	public static void main(String[] args) {
		System.out.println("x is " + x);
		
		InnerClass ic = new InnerClass();
		
		InsideInnerClass iic = ic.new InsideInnerClass();
		
		System.out.println("The data from inner class is: " + iic.y);
		
	}
	
	private class InsideInnerClass {
		private int y = 11;
	}
}
