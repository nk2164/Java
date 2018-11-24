package com.nk2164.basics;

public class StudentTest {
	
	public static void main(String[] args) {
		int[] id = new int[] {1001,1002,1003};
		
		Student student1 = new Student(id[0],"joan");
		student1.gender = "male";
		
		Student student2 = new Student(id[1],"raj");
		student1.gender = "male";
		
		Student student3 = new Student(id[2],"anita");
		student1.gender = "female";
		
	    System.out.println("Name of Student1 "+ student1.name);
	    System.out.println("Name of Student2 "+ student2.name);
	    System.out.println("Name of Student3 "+ student3.name);
	    
	    student1.updateProfile("JOHN");
	    System.out.println("Name of Student1 "+ student1.name);
	    
	}

}
