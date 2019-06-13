package com.nk2164.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ProductCatalogue implements Iterable<Product> {
	
	private final Set<Product> products = new TreeSet<>();
	
	public void isSuppliedBy(Supplier supplier) {
		products.addAll(Supplier.products());
	}
	
	@Override
	public Iterator<Product> iterator() {
		return products.iterator();
	}

}
