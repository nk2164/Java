package com.nk2164.simon.lesson1;

public class M7L2 {
	private int x; //non static
	private static int y; ///static member variable
	
	public static void main(String[] args) {
		y = 99;
		System.out.println("y is " + y);
		
		M7L2 object1 = new M7L2();
		M7L2 object2 = new M7L2();
		
		System.out.println("object1.y is " + object1.y);
		System.out.println("object2.y is " + object2.y);
		
		object1.x = 100;
		object2.x = 200;

		System.out.println("object1.x is " + object1.x);
		System.out.println("object2.x is " + object2.x);
		
		showY();
	}
	
	static void showY() {
		System.out.println("y is " + y);
		System.out.println("M7L2.y is " + M7L2.y);
//		System.out.println("this.y is " + this.y);

//		System.out.println("x is " + x);
//		System.out.println("this.x is " + this.x);
	}
}
