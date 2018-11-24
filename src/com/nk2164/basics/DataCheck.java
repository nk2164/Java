package com.nk2164.basics;

import java.util.Calendar;

public class DataCheck {

	public static void main(String[] args) {
	    Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2015);
        calendar.set(Calendar.MONTH, 7);
        calendar.set(Calendar.DAY_OF_MONTH, 5);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

	}

}
