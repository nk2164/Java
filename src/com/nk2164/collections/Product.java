package com.nk2164.collections;

public class Product {

	private String name;
	private int weight;
	
	public Product(String name,int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getWeignt() {
		return weight;
	}

	@Override
	public String toString() {
		return "Product{name = " + this.name + ", weight = " + this.weight + "}";
	}
	
} 
