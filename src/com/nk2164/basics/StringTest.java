package com.nk2164.basics;

public class StringTest {
	public static void main(String[] args) {
		String s = "Hello, World!";
		String s1 = new String(s);
		String s2 = new String(s);
		System.out.println("s1 == s2 is " + (s1 == s2));
		s1 = s1.intern();
		s2 = s2.intern();
		System.out.println("s1 == s2 is " + (s1 == s2));
		System.out.println("s  == s1 is " + (s == s1));
		System.out.println("s  == s2 is " + (s == s2));
		System.out.println("s1 is " + s1);
	}
}
