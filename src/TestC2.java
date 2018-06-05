import java.util.*;

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

    // FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
    //   System.out.println("In the uppper loop a = "+a);
    //   for (char x = 'a'; x <= 'c'; x++) {
    //     if (a == 2 || x == 'b')
    //       {
    //         System.out.println("executing continue, a="+a+" x="+x);
    //         continue /*FIRST_CHAR_LOOP*/;
    //       }
    //     System.out.println("made it past if check and will print");
    //     System.out.println(" " + a + x);
    //   }
    // }

    // String s1 = "1";
    // String s2 = s1.concat("2");
    // s2.concat("3");    // just contenating will not change the value.
    // System.out.println(s2);

    // String string = "animals";
    // System.out.println(string.toUpperCase());  // ANIMALS
    // System.out.println("Abc123".toLowerCase());  // abc123

    // System.out.println("abc".equals("ABC"));  // false
    // System.out.println("ABC".equals("ABC"));  // true
    // System.out.println("abc".equalsIgnoreCase("ABC"));  // true

    // System.out.println("abc".startsWith("a")); // true
    // System.out.println("abc".startsWith("A")); // false
    // System.out.println("abc".endsWith("c")); // true
    // System.out.println("abc".endsWith("a")); // false

    // System.out.println("abc".contains("b")); // true
    // System.out.println("abc".contains("B")); // false

    // System.out.println("abcabc".replace('a', 'A')); // AbcAbc
    // System.out.println("abcabc".replace("a", "A")); // AbcAbc

    // System.out.println("abc".trim());           // abc
    // System.out.println("\t   a b c\n");
    // System.out.println("\t   a b c\n".trim()); // a b c

    // String start = "AniMaL   ";
    // String trimmed = start.trim();                 // "AniMaL"
    // String lowercase = trimmed.toLowerCase();      // "animal"
    // String result = lowercase.replace('a', 'A');   // "AnimAl"
    // System.out.println(result);

    // String result = "AniMaL   ".trim().toLowerCase().replace('a', 'A');
    // System.out.println(result);

    // String a = "abc";
    // String b = a.toUpperCase(); // "ABC"
    // b = b.replace("B", "2").replace('C', '3'); // "A23"
    // System.out.println("a=" + a);
    // System.out.println("b=" + b);

    // String alpha = "";
    // for(char current = 'a'; current <= 'z'; current++)
    //     alpha += current;
    // System.out.println(alpha);

    // StringBuilder alpha = new StringBuilder();
    // for(char current = 'a'; current <= 'z'; current++)
    //   alpha.append(current);
    // System.out.println(alpha);

    // StringBuilder sb = new StringBuilder("start");
    // sb.append("+middle");                      // sb = "start+middle"
    // StringBuilder same = sb.append("+end");    // "start+middle+end"
    // System.out.println("sb: "+sb+" same: "+same);

    // StringBuilder a = new StringBuilder("abc");
    // StringBuilder b = a.append("de"); // b is referencing the same object (a).
    // b = b.append("f").append("g");
    // System.out.println("a=" + a);
    // System.out.println("b=" + b);

    // StringBuilder sb = new StringBuilder("animals");
    // String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
    // int len = sb.length();
    // char ch = sb.charAt(6);
    // System.out.println(sub + " " + len + " " + ch);

    // StringBuilder sb = new StringBuilder().append(1).append('c');
    // sb.append("-").append(true);
    // System.out.println(sb);      // 1c-true

    // StringBuilder sb = new StringBuilder("animals");
    // sb.insert(7, "-");      // sb = animals-
    // sb.insert(0, "-");      // sb = -animals-
    // sb.insert(4, "-");      // sb = -ani-mals
    // System.out.println(sb);
    //                                    012345
    // StringBuilder sb = new StringBuilder("abcdef");
    // sb.delete(1, 3);      // del starts at index 1 and ends right before index 3
    //                       // giving string 'adef'
    // System.out.println(sb);
    // sb.deleteCharAt(3);
    // System.out.println(sb);

    // StringBuilder sb = new StringBuilder("ABC");
    // sb.reverse();
    // System.out.println(sb);

    // StringBuilder sb1 =  new StringBuilder(3);
    // sb1.append("abc");
    // System.out.println(sb1.length());
    // System.out.println(sb1.toString());

    // String [] bugs = { "cricket", "beetle", "ladybug" };
    // String [] alias = bugs;
    // System.out.println(bugs.equals(alias));     // true
    // System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0

    // String[] strings = { "stringValue" };
    // Object[] objects = strings;
    // String[] againStrings = (String[]) objects;
    // //againStrings[0] = new StringBuilder();   // DOES NOT COMPILE
    // objects[0] = new StringBuilder();// careful! - we get an array store exception.

    // int[] numbers = { 6, 9, 1 };
    // java.util.Arrays.sort(numbers);
    // for (int i = 0; i < numbers.length; i++)
    //   System.out.println(numbers[i] +  " ");

    // String[] strings = { "10", "9", "100" };
    // java.util.Arrays.sort(strings);
    // for (String string : strings)
    //   System.out.print(string + " ");

    // int[] numbers = {2,4,6,8};
    // System.out.println(Arrays.binarySearch(numbers, 2)); // 0
    // System.out.println(Arrays.binarySearch(numbers, 4)); // 1
    // System.out.println(Arrays.binarySearch(numbers, 1)); // -1
    // System.out.println(Arrays.binarySearch(numbers, 3)); // -2
    // System.out.println(Arrays.binarySearch(numbers, 9)); // -5

    // ArrayList<String> safer = new ArrayList<>();
    // safer.add("sparrow");
    // safer.add(Boolean.TRUE);    // DOES NOT COMPILE

    // List<String> birds = new ArrayList<>();
    // birds.add("hawk");                    // [hawk]
    // birds.add("hawk");                    // [hawk, hawk]
    // System.out.println(birds.isEmpty());     // false
    // System.out.println(birds.size());     // 2
    // birds.clear();                         // []
    // System.out.println(birds.isEmpty());     // true
    // System.out.println(birds.size());     // 0

    float value1 =102;
    float value2 = (int)102.0;
    float value3 =1f * 0.0f;
    float value4 =1f * (short)0.0;
    float value5 =1f * 0f;

    }
}
