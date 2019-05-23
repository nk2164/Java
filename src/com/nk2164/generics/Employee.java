package com.nk2164.generics;

public class Employee {
	private String name;
	//Constructor
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return String.format("Employee{name=%s}", name);
	}
}
