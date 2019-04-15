package com.nk2164.basics;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Integer[] arrayOfIntegers = {22,32,42,52,62,72,82,92};
		String[]  arrayOfString   = {"A","B","C","D","E","F","G","H"};
	
		Map<String,Integer> mapOfStringIntPairs = new HashMap<String, Integer>();
		
		for (int j = 0; j < arrayOfIntegers.length; j++) {
			mapOfStringIntPairs.put(arrayOfString[j], arrayOfIntegers[j]);
		}
		
		String key = "X";
		
		if (mapOfStringIntPairs.containsKey(key)) {
			System.out.printf("Key = %s is present with Value =  %d %n", key ,mapOfStringIntPairs.get(key));
		}
		else {
			System.out.printf("Key %s is not present. %n", key);
		}
		
		// Demonstrate the same functionality using keyset method.
		for (String someKey:mapOfStringIntPairs.keySet()) {
			System.out.printf("The maps contains %s key with " +
					           "value = %d %n", someKey,mapOfStringIntPairs.get(someKey));
			
		}
		
	}
}
