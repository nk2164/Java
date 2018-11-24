package com.nk2164.basics;

public class Student {

	int id;
	String name;
	String gender = "male";

	public Student(int id, String name) {
		this(name);
		this.id = id;
	}

	public Student(String name) {
		this.name = name;
	}
	
	boolean updateProfile(String name) {
		this.name = name;
		return true;
	}

}
