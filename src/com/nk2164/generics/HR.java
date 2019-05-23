package com.nk2164.generics;

import java.util.List;

public class HR {

	public static void printEmpNames(List<Employee> employees) {
		employees.stream().map(Employee::getName).forEach(System.out::println);
	}
}
