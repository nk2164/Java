// find the sum of the even valued fibonacci terms less than 4 million.

class P0002  {

  public static void main(String[] args) {
    int x = 1; // First fib term
    int y = 2; // Second fib term
    int sum = 0;
    boolean done = false;
    final int maxTermValue = 4000000;

    while(!done){
       sum = sum  +
             (isEven(x)? x:0) +
             (isEven(y)? y:0);

       // Now get the next 2 fibonacci sequence.

       x =  x+y;   // new x
       y =  x+y;   // new y

       // Now, break the loop if any of next term values in the
       // sequence exceeds the maxTermValue.

       if ((x > maxTermValue) || (y > maxTermValue))
        {done = true;}
    };

    System.out.println("sum is : "+ sum);
  }

  private static boolean isEven(int num){
    return (num%2 == 0);  // return true of even else false
  }

}
