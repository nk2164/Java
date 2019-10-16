package com.nk2164.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Supplier {
	private String name;
	private final static Set<Product> products = new HashSet<>();
	
	public Supplier(String name) {
		this.name = name;
	}


	public static Set<Product> products() {
		return products;
	}

}
