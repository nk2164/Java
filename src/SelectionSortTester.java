// Simple Selection sort example ..this runs at O(n^2) and not recommended
// for large lists.
class SelectionSortTester {

  public static void main ( String[] args ){
   int[] values = { 17, 5, 21, 8, 19, 2, 23, 15, 4, 13 ,14,12,32,14,56};

   // print out the array
   System.out.println("initial values: ");
   for ( int val : values )
     System.out.print( val + ", " );

   // sort the array
   selectionSort( values );

   // print out the array
   System.out.println("\nsorted values: ");
   for ( int val : values )
     System.out.print( val + ", " );

   System.out.println( );
  }

  private static void selectionSort(int[] values){
    int minIndex = 0;
    int tempNum  = 0;
    System.out.println( );

    for (int j=0;j<=values.length-2;j++) {
      System.out.println("Processing " + values[j] + " at index " + j);
      minIndex = j;
      for (int k=j+1;k<=values.length-1;k++) {
        if (values[minIndex] > values[k]){
           minIndex = k;
        }
      }
      if (values[minIndex] != values[j]) {
        System.out.println("Found that " + values[minIndex]+ " is the smallest number in the remaining list" );
        System.out.println("Swapping " + values[j] + " at index " + j + " with " + values[minIndex] + " at index " + minIndex);
      }
      else{
        System.out.println("Did not find  a smaller number, No Swapping needed");
      }
      tempNum = values[j];
      values[j] = values[minIndex];
      values[minIndex] = tempNum;
      System.out.println("Now position "+ j + " has " + values[j]);
      System.out.println("**** Done Processing position " + j + " ****");
    }
  }

}
