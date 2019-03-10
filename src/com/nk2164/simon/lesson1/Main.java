package com.nk2164.simon.lesson1;

public class Main {
	
	public static void main(String[] args) {
		Thing t = new Thing();
		int n = t.numOne;  //t.numOne is a L value expression
		System.out.println("Value read is " + n);
		
		System.out.println("t is " + t);
		t.numOne = 99;
		t.numTwo = 100;
		System.out.println("t is " + t);
		
		Box b = new Box();
		System.out.println("numOne in a boxed thing is " + b.getOneThing().numOne);
		b.getOneThing().numOne = 5432;
		System.out.println("numOne in a boxed thing is " + b.getOneThing().numOne); 
		
		System.out.println("numOne in a boxed things is " + b.getManyTings()[0].numOne);
		b.getManyTings()[0].numOne = 5432;
		System.out.println("numOne in a boxed things is " + b.getManyTings()[0].numOne);
		
		System.out.println("t is " + t);
		t.doStuff();
		System.out.println("t is " + t);
		
		System.out.println("is t the same as t ?" + t.sameAs(t));
	}

}
