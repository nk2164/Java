// Search for a given int in an array of ints. Use Recursion.
// Inspired by the Book "Algorithms Unlocked" by Thomas Corman.

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveSearchTest  {

  static int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

  static int numItems = arr.length;
  static int currPosition = 0; // Indexes start with 0
  static int numToFind = 0;    // Initialize

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Here is the array of numbers : " + Arrays.toString(arr));

    while (true) {
      System.out.println("Enter a number to find (OR 'Q' to Quit)");

      String inpText = sc.next();

      if (inpText.equalsIgnoreCase("Q")) {
        System.out.println("OK, Game over ..Bye now !");
        break;
      }

      try {
        numToFind = Integer.parseInt(inpText);
        System.out.println(RecursiveSearch(arr,numItems,currPosition,numToFind));
      }
      catch (NumberFormatException exp){
        System.out.println("Umnn, That was not a number, please try again ");
      }
    }
    sc.close();
  }

  public static String RecursiveSearch(int[] arr,
                             int numItems,
                             int currPosition,
                             int numToFind) {

     if ((currPosition+1) > numItems) {
       return "Sorry ! " + numToFind  + " is not-found in the array";
     }
     else {
       if (arr[currPosition] == numToFind){
         return "Found it! The number " + numToFind + " is in position " + (currPosition+1);
       }
       else {
         // Call RecursiveSearch method again with currPosition incremented.
         return (RecursiveSearch(arr,numItems,(currPosition += 1),numToFind));
       }
     }
  }
}
