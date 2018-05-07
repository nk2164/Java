// InsertionSort example ..this runs at O(n^2) and not recommended
// for large lists. 
class InsertionSort {

  public static void main ( String[] args ){
   int[] values = { 17, 5, 21, 8, 19, 2, 23, 15, 4, 13 ,14,12,32,14,56};

   // print out the array
   System.out.println("Initial values: ");
   for ( int val : values )
     System.out.print( val + ", " );

   System.out.println();

   // sort the array
   insertionSort( values );

   // print out the array
   System.out.println("\nFinal Sorted values: ");
   for ( int val : values )
     System.out.print( val + ", " );

   System.out.println( );
  }

  private static void insertionSort(int[] values){
    boolean swapFlag = false;
    int tempNum  = 0;
    int k = 0;

    System.out.println( );

    for (int j=0;j<values.length;j++) {
      System.out.println("**** Now processing Position "+ j + " having value " + values[j] + " ****");
      k = j;
      while (k > 0 && values[k-1] > values[k]) {
        tempNum = values[k-1];
        values[k-1] = values[k];
        values[k] = tempNum;
        System.out.println("Swapped " + values[k] + " with " + values[k-1]);
        k = k-1;
        swapFlag = true; // used for printing
      }
      if (!swapFlag){
        System.out.println();
        System.out.println("No changes were made, " + values[j] + " is at the correct spot at this time" );
      }
      swapFlag = false; // reset it before processing again.
      // print out the array
      System.out.println("\nList now looks like this: ");
      for ( int val : values )
        System.out.print( val + ", " );
      System.out.println();
      System.out.println("**** Position " + j + " now has value " + values[j] + "****");
      System.out.println();
    }
  }

}
