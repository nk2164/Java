class TestC2 {
  public static void main(String[] args) {
    // short a = 19;
    // short b = 20;
    //
    // short y = (short)(a+b);
    //
    // System.out.println("The value of y is: "+y);

    // int x = 10, y = 20;
    // x+=2+(++x);
    // y-=2;
    // System.out.println("x = "+x);
    // System.out.println("y = "+y);
    //
    // long x = 10;
    // int y = 5;
    //
    // // y = y * x;
    // y += x;
    //
    // System.out.println("The value of y is "+y);

    // System.out.println(true & false);

    // boolean y = false;
    // boolean x = (y = true);
    // System.out.println(x);  // Outputs true

    // int y = 10;
    // int x = (y > 5) ? (2 * y) : (3 * y);
    // System.out.println("The value of x is "+x);

    // int x = 1;
    // switch (x) {
    //   default:
    //     System.out.println("In the default");
    //     break;
    //   case 1:
    //     System.out.println("The value is 1");
    //     break;
    //   case 2:
    //     System.out.println("The value is 2");
    //     break;

    // int x = 0;
    // do {
    //   x++;
    // } while(false);
    // System.out.println(x);  // Outputs 1

    // for(int i = 0; i < 10; i++) {
    //    System.out.println(i + " ");
    //  }

    // int x = 0;
    // for(long y = 0,z = 4; x < 5 && y < 10; x++, y++) {
    //   System.out.println(y + " ");
    // }
    // System.out.println(x);
    //
    // int x = 0;
    // for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {   // DOES NOT COMPILE
    //   System.out.print(x + " ");
    // }

    // int x = 0;
    // long y = 10;
    // for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
    //   System.out.print(x + " ");
    // }

    // for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) {   // DOES NOT COMPILE
    //   System.out.print(x + " ");
    // }

    for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
      System.out.print(y + " ");
    }
    System.out.print(x);  // DOES NOT COMPILE

    }
}
