package com.nk2164.basics;

public class EclipseCheatSheet {

	private String name;
	private String address;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public EclipseCheatSheet(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public static void main(String[] args) {
		doStuff();
	}
	
	private static void doStuff() {
		printStuff();
		
	}
	
	@Override
	public String toString() {
		return "EclipseCheatSheet [name=" + name + ", address=" + address + "]";
	}

	public void printMe() {
		System.out.println("Standard output !!");
	}

	private static void printStuff() {
		int newText = 0;
		while (newText < 10) {
			System.out.println(newText++);
		}
	}

}
