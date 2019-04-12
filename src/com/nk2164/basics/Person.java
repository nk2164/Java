package com.nk2164.basics;

public class Person {
	private String name;
	public String hairColor;

	public String getName() {
		return this.name;
	}
	
	public void greet() {
		System.out.println("Hello, my name is " + name);
	}
	
	public Person(String name,String hairColor) {
		this.name = name;
		this.hairColor = hairColor;
	}
}
