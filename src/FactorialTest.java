/* Find the factorial of a given number recursively.
   This is inspired by the book "Algorithms Unlocked" by Thomas Corman. */
import java.util.Scanner;
public class FactorialTest {
  public static double num = 0;

  public static void main(String[] args) {
    String inputText;
    Scanner sc = new Scanner(System.in);
    System.out.println("This programs gets the factorial of a number !");

    while (true) {
      System.out.println("Please enter the number (or enter 'Q' to quit)");
      inputText = sc.next();

      if (inputText.equalsIgnoreCase("Q")){
        System.out.println("OK,Game over...Bye now");
        break;
      }

      try {
        num = Double.parseDouble(inputText);
        System.out.println("The factorial of the number (n!) is "+ factorial(num));
      }
      catch (NumberFormatException e) {
        System.out.println("Hmnn, that is not a number, please try again");
      }
    }
    sc.close();
   }

  private static double factorial(double num){
    if (num == 0) {
      return 1;
    }
    else {
      return num * factorial(num-1);
    }
  }
}
