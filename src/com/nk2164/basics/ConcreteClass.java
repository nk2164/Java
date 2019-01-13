package com.nk2164.basics;

public class ConcreteClass extends AbstractClass {

	public ConcreteClass(String name,int age) {
		this.name = name;
		this.age  = age;
	}
	
	@Override
	String getName() {
		return this.name;
	}

	@Override
	int getAge() {
		return this.age;
	}

	private void printNameAndAge() {
		System.out.println("Name =" + this.name + " Age =" + this.age);
	}
	
	public static void main(String[] args) {
		ConcreteClass c1 = new ConcreteClass("John", 21);
		c1.printNameAndAge();
	}

}