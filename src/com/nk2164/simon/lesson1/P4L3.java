package com.nk2164.simon.lesson1;

public class P4L3 {
	
	public static void main(String[] args) {
		String s1 =  new String("Hello") ;
		String s2 =  new String("Hello") ;
		
		String s3 = s1;
		
		System.out.println("s1 == s2 is " + (s1 == s2));
		System.out.println("s1 == s3 is " + (s1 == s3));
		
		System.out.println("s1.equals(s2) is " + s1.equals(s2));
		System.out.println("s1.equals(s3) is " + s1.equals(s3));
		
		StringBuilder sb1 =  new StringBuilder("Hello") ;
		StringBuilder sb2 =  new StringBuilder("Hello") ;
		
		StringBuilder sb3 = sb1;
		
		System.out.println("sb1 == sb2 is " + (sb1 == sb2));
		System.out.println("sb1 == sb3 is " + (sb1 == sb3));
		
		System.out.println("sb1.equals(sb2) is " + sb1.equals(sb2));
		System.out.println("sb1.equals(sb3) is " + sb1.equals(sb3));
	}	
}
