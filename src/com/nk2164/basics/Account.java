package com.nk2164.basics;

public class Account {

	private String name; // instance variable
	private double balance;
	
	public Account(String name) {
		this.name = name;
	}
	
	// Account constructor that received two parameters.
	public Account(String name, double balance) {
		this.name = name;
		
		// validate that the balance is greater than 0.0; it its not,
		// instance variable balance keeps its default initial value of 0.0
		if (balance > 0.0) {
			this.balance = balance;
		}
	}
	
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) {
			balance = balance + depositAmount; // add it to the balance
		}
	}
	
	public boolean withdraw(double withdrawAmount) {
		if (this.balance >= withdrawAmount) {
			balance = balance - withdrawAmount;
			return true;
		}
		return false;
	}
	
	public Account() {
		this.name = "Init";
	}
	
	public void setName(String name) {
		this.name = name; // store the name . name is the parameter
	}
	
	public String getName() {
		return this.name; // return the value of name to caller
	}
	
	public double getBalance() {
		return balance;
	}
	
}