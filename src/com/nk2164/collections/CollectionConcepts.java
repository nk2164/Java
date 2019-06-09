package com.nk2164.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {

	public static void main(String[] args) {
		Product door = new Product("Wooden Door", 35);
		Product floorPanel = new Product("Floor Panel", 25);
		Product window = new Product("Glass Window", 10);
		
		Collection<Product> products = new ArrayList<>();
		
		products.add(door);
		products.add(floorPanel);
		products.add(window);
		
		for (Product product : products) {
			System.out.println(product);
		}
		
		System.out.println(products.size());
		System.out.println(products.isEmpty());
		System.out.println(products.contains(window));
		
		Collection<Product> otherProducts = new ArrayList<>();
		otherProducts.add(door);
		otherProducts.add(floorPanel);
		otherProducts.add(window);
		
		otherProducts.remove(door);
		
		System.out.println(otherProducts);
		
	}
}
