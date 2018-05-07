public class IsSorted
{
  // Determine if an array is sorted in ascending order
  //
  public static boolean isSorted( int[] array )
  {
    boolean inOrder = true;

    // scan the list starting at index 0
    for ( int j=0; j<array.length-1 && inOrder; j++ )
    {
      // check the pair starting at j
      inOrder = array[j] <= array[j+1];
    }

    return inOrder; // True or False value
  }

  public static void main ( String[] args )
  {
    int[] values = {-49, -23, -5, -4, -1, 12, 17, 23, 32, 45, 56};

    // print out the array
    System.out.println("values: ");
    for ( int val : values )
      System.out.print( val + ", " );

    System.out.println( );

    // determine if it is in order
    if ( isSorted(values) )
      System.out.println( "Is in order" );
    else
      System.out.println( "Is NOT in order" );

   }
}
