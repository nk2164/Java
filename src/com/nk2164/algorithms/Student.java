package com.nk2164.algorithms;

public class Student {
	
	private String name;
	private double average;
	
	// constructor initializes instance variable
	public Student(String name, double average) {
		this.name = name;

		// validate that average is > 0.0  and <= 100.0; otherwise,
		// keep instance variable average's current value.
		
		if (average > 0.0)
			if (average <= 100.0) {
				this.average = average; // assign to instance variable.
			}	
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		// validate that average is > 0.0  and <= 100.0; otherwise,
		// keep instance variable average's current value.
		if (average > 0.0)
			if (average <= 100.0) {
				this.average = average; // assign to instance variable.
			}
	}
	
	public String getName() {
		return name;
	}
	
	// determines and returns the student's letter grade.
	public String getLetterGrade() {
		String letterGrade = "";
		
		if (average >= 90.0)
			letterGrade = "A";
		else if (average >= 80.0) 
			letterGrade = "B";
		else if (average >= 70.0) 
			letterGrade = "C";
		else if (average >= 60.0) 
			letterGrade = "D";
		else
			letterGrade = "F";
		
		return letterGrade;
	}
	
} // end class student