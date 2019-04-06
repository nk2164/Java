package com.nk2164.simon.lesson1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex1 {

	public static void main(String[] args) {
		// new API's use factories , not constructors..
		
		LocalDate today = LocalDate.now();
		LocalDate next = today.plusDays(3);
		System.out.println(today);
		System.out.println(next);
		LocalDate next2 = today.plus(5,ChronoUnit.DAYS);
		System.out.println(next2);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd");
		System.out.println(dtf.format(next2));
	
	}
}
