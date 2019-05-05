package com.nk2164.basics;

public class TypeUnsafeExample {
	
	public static void main(String[] args) {
		CircularBuffer buffer = new CircularBuffer(10);
		
		buffer.offer("a");
		buffer.offer("b");
		buffer.offer("c");
		buffer.offer("d");

		String value = Concatenate(buffer);
		System.out.println(value);

	}
	
	public static String Concatenate(CircularBuffer buffer) {
		StringBuilder result = new StringBuilder();
		
		String value;
		
		while ((value = (String) buffer.poll()) != null) {
			result.append(value);
		}
		
		return result.toString();
	}

}
