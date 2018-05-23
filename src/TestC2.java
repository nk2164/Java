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

    // for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
    //   System.out.print(y + " ");
    // }
    // System.out.print(x);  // DOES NOT COMPILE

    // String[] textArray = {"Apple","Banana","Orange","Grapes"};
    //
    // for (String fruit : textArray ) {
    //   System.out.println(fruit + ",");
    // }

    // java.util.List<String> values = new java.util.ArrayList<String>();
    //
    // values.add("Lisa");
    // values.add("Kevin");
    // values.add("Roger");
    //
    // for(String value : values) {
    //   System.out.println(value + ", ");
    // }

    // String names = "Lisa";
    // for(String name : names) {   // DOES NOT COMPILE
    //   System.out.print(name + " ");
    // }

    // java.util.List<Integer> x = new java.util.ArrayList<Integer>();
    //
    // x.add(1);
    // x.add(2);
    // x.add(3);
    // x.add(4);
    //
    // for (java.util.Iterator<Integer> i = x.iterator();i.hasNext(); ) {
    //   Integer values = i.next();
    //   System.out.println(values + ", ");
    // }

    // java.util.List<String> names = new java.util.ArrayList<String>();
    // names.add("Lisa")
    // names.add("Kevin");
    // names.add("Roger");
    // for(int i=0; i<names.size(); i++) {
    //
    //   String name = names.get(i);
    //
    //   if(i>0)
    //    {
    //     System.out.print(", ");
    //    }
    //   System.out.print(name);
    // }
    // System.out.println();

    // int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7,10}};
    //
    // for(int[] mySimpleArray : myComplexArray) {
    //   for(int i=0; i<mySimpleArray.length; i++) {
    //     System.out.print(mySimpleArray[i]+"\t");
    //    }
    //    System.out.println();
    //   }

    // int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
    //
    // OUTER_LOOP:  for(int[] mySimpleArray : myComplexArray) {
    //   INNER_LOOP:  for(int i=0; i<mySimpleArray.length; i++) {
    //     System.out.print(mySimpleArray[i]+"\t");
    //   }
    //     System.out.println();
    // }

    // int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
    // int searchValue = 2;
    // int positionX = -1;
    // int positionY = -1;
    //
    // PARENT_LOOP: for(int i=0; i<list.length; i++) {
    //   System.out.println("I came here with "+ i);
    //
    //   for(int j=0; j<list[i].length; j++) {
    //     System.out.println("Inside For loop");
    //     if(list[i][j]==searchValue) {
    //       positionX = i;
    //       positionY = j;
    //       break /*PARENT_LOOP*/;
    //     }
    //   }
    // }
    //
    // if(positionX==-1 || positionY==-1) {
    //   System.out.println("Value "+searchValue+" not found");
    // }
    // else
    // {
    //   System.out.println("Value "+searchValue+" found at: " +
    //     "("+positionX+","+positionY+")");
    // }

    FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
      System.out.println("In the uppper loop a = "+a);
      for (char x = 'a'; x <= 'c'; x++) {
        if (a == 2 || x == 'b')
          {
            System.out.println("executing continue, a="+a+" x="+x);
            continue /*FIRST_CHAR_LOOP*/;
          }
        System.out.println("made it past if check and will print");
        System.out.println(" " + a + x);
      }
    }


    }
}
