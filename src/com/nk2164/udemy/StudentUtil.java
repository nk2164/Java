package com.nk2164.udemy;

public class StudentUtil {

	public static void main(String[] args) {
		int[] studentIdList     = {1001,1002};
		char[][] studentsGrades = {{'A','A','A','B'},{'A','B','B'}};
		
		System.out.println("output from calculateGPA");
		
		int i = 0;
		for (double studentGPA : calculateGPA(studentIdList, studentsGrades)) {
			System.out.println("Student-ID: " + studentIdList[i] + " GPA: " + studentGPA);
			i+=1;
		}

		System.out.println();
		
		double lower = 3.1 , higher = 3.9;
		System.out.println("output from getStudentsByGPA" + " lower= " + lower + " higher= " + higher);

		for (int studentID : getStudentsByGPA(lower, higher, studentIdList, studentsGrades)) {
			System.out.println("StudentID :" + studentID);
		}

	}

	/* int[] studentIdList = {1001,1002} */
	/* char[][] studentGrades = {{'A','A','A','B'},{'A','B','B'}} */

	/* studentGrades A=4,B=3 & C=2 calculate the GPA */

	public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
		double sumGradesNumeric;
		double avgGradesNumeric;
		
		double[] studentGPAList = new double[studentIdList.length];

		for (int i = 0; i < studentIdList.length; i++){
			/* Initialize the sum */
			sumGradesNumeric = 0;
			avgGradesNumeric = 0;
			
			for (int j = 0; j < studentsGrades[i].length; j++){
				if (studentsGrades[i][j] == 'A') {
					sumGradesNumeric += 4;
				} else if (studentsGrades[i][j] == 'B') {
					sumGradesNumeric += 3;
				} else if (studentsGrades[i][j] == 'C') {
					sumGradesNumeric += 2;
				}
			}
			
			/* find the average */
			avgGradesNumeric =  (sumGradesNumeric/studentsGrades[i].length);
			
			/* copy the average to GPA list */
			studentGPAList[i] = avgGradesNumeric;			
		}

		return studentGPAList;
	}

	// Example:- lower = 3.2 , higher = 3.5 , int[] studentIdList = {1001,1002},  char[][] studentGrades = {{'A','A','A','B'},{'A','B','B'}}
	// output = {1002} - basically find the grade that is occuring in b/w lower and higher value

	public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
		double[] studentGPAList = new double[studentIdList.length];
		
		// perform parameter validation. Return null if passed parameters are not valid
		
		if (lower > higher) {
			return null; //returns null if input is not valid
		}

		if ((lower < 0) || (higher < 0)) {
			return null; //returns null if input is not valid
		}
		
		if ((studentIdList == null) || (studentsGrades == null)) {
			return null; //returns null if input is not valid
		}

		// invoke calculateGPA
		studentGPAList = calculateGPA(studentIdList, studentsGrades);

		// construct the result array and return it. You would need an extra for loop to
		// compute the size of the resulting array
		int arraySize = 0;
		
		for (int i = 0; i < studentGPAList.length; i++) {
			if ((studentGPAList[i] >= lower) && (studentGPAList[i] <= higher)) {
				arraySize+=1;
			}
		}

		int[] gradesOutPut = new int[arraySize];
		
		int cnt = 0; 
		
		for (int i = 0; i < studentGPAList.length; i++) {
			if ((studentGPAList[i] >= lower) && (studentGPAList[i] <= higher)) {
				gradesOutPut[cnt] = studentIdList[i];
				cnt += 1;
			}
		}
		
		return gradesOutPut;
	}

}
