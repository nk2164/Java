package com.nk2164.generics;

public class Salaried extends Employee {
	public static final double DEFAULT_SALARY = 120000;
	private double salary = DEFAULT_SALARY;
	
	public Salaried(String name) {
		this(name,DEFAULT_SALARY);
	}

	public Salaried(String name,double salary) {
		super(name);
		this.salary = salary;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	@Override
	public String toString() {
		return String.format("Salaried{name=%s,Salary=%d} %s", getName(),salary,super.toString());
	}
}
