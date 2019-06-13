package com.nk2164.collections;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {

	private String name;
	private int weight;

	public Product(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Product{name = " + this.name + ", weight = " + this.weight + "}";
	}

	@Override
	public int compareTo(Product product) {
		int compareWeight = product.getWeight();
		return this.weight - compareWeight; // ascending order.
	}

	public static Comparator<Product> BY_WEIGHT = new Comparator<Product>() {
		public int compare(Product product1, Product product2) {
			return product1.compareTo(product2);
		}
	};

	@Override
	public int hashCode() {
		return Objects.hash(name, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		final Product product = (Product) obj;

		if (weight != product.weight)
			return false;
		return Objects.equals(name, product.name);

	}
}
