package com.nk2164.basics;

import java.util.Calendar;
import java.util.Locale;

public class StringTest {
	public static void main(String[] args) {
//		String s = "Hello, World!";
//		String s1 = new String(s);
//		String s2 = new String(s);
//		System.out.println("s1 == s2 is " + (s1 == s2));
//		s1 = s1.intern();
//		s2 = s2.intern();
//		System.out.println("s1 == s2 is " + (s1 == s2));
//		System.out.println("s  == s1 is " + (s == s1));
//		System.out.println("s  == s2 is " + (s == s2));
//		System.out.println("s1 is " + s1);
		
//		Calendar c1 = Calendar.getInstance();
//		c1.set(2019, 5, 5);
//		String output = String.format("There are %d planets now that " + 
//		                              "%s was demoted on %3$tB %3$td , %3$tY", 8, "pluto" , c1);
//		System.out.println(output);
//		System.out.println(Locale.getDefault(Locale.Category.DISPLAY));
		
		String s1 = "Hello";
		String s2 = new String("Hel") + new String("lo");
		
		if (s1.equals(s2)) {
			System.out.println("They are equal");	
		}
		else {
			System.out.println("Not equal");
		} 
		
	}
}
