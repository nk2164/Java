public class P1Alt {
  public static void main(String[] args) {
    int maxNum = 1000; //Find sum of multiples upto this
                       //number
    int result = sumMultOf(3,maxNum) +
                 sumMultOf(5,maxNum) -
                 sumMultOf(15,maxNum); //Subtracting multiples of
                                       //15 since we are looking
                                       //for sumMultOf(3) or (5)
                                       //not both.

    System.out.println(result);
  }

  private static int sumMultOf(int num,int maxNum){
    int n = (maxNum-1)/num;//Subtracting 1 from maxNum since
                           //since we are looking for sumMultOf
                           //Upto (not including) maxNum.
    return num * ((n*(n+1))/2);
  }
}
