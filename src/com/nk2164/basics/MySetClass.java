package com.nk2164.basics;

import java.util.HashSet;

public class MySetClass {
  public static void main(String[ ] args) {
    HashSet<String> set = new HashSet<String>();
    set.add("A");
    set.add("B");
    set.add("C");
    System.out.println(set);
  }
}	
//  Output: [A, B, C]