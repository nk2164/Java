package com.nk2164.basics;

public class ConcreteClass extends AbstractClass implements InterfaceTest {

	public ConcreteClass(String name,int age) {
		this.name = name;
		this.age  = age;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getAge() {
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