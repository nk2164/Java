package com.nk2164.basics;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		Integer[] arrayofInteger = {22,23,45,67,89,23};
		 String[] arrayofString  = {"Hi","Hello","Howdy","Green","Yellow"};
		
		List<Integer> listOfInteger = new ArrayList<>();
		List<String>  listOfString  = new ArrayList<>();

		for(Integer num : arrayofInteger) {
			listOfInteger.add(num);
		}
		
		for(Integer num : listOfInteger) {
			System.out.println(num);
		}

		for(String text : arrayofString) {
			listOfString.add(text);
		}

		for(String text : arrayofString) {
			System.out.println(text);
		}
		
		
	}

}
