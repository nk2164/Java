package com.nk2164.basics;

import java.util.Scanner;

public class StringCheck {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        boolean firstTime = true;
        
        for (int a = 0;a < k; a++) {
         for (int i =a,j=a+k;i<s.length() && j <= s.length();i+=k,j+=k) {

           if (a == 0 && firstTime) {
        	   firstTime = false;
        	   smallest = s.substring(i,j);
        	   largest = s.substring(i,j);
           }
           
           if (smallest.compareTo(s.substring(i,j)) > 0) {
        	   smallest = s.substring(i,j);
           }
           
           if (largest.compareTo(s.substring(i,j)) < 0) {
        	   largest = s.substring(i,j);
           }
        	   
         }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}