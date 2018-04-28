// This prints 'DeerReinDeer,false' . Since the reference variable
// deer points to a ReinDeer in the main method, why is it still
// printing 'false' ?

public  class Deer {
  public Deer() {System.out.print("Deer");}
  public Deer(int age) {System.out.print("DeerAge");}
  private boolean hasHorns() {return false;}
  public static void main(String[] args) {
    Deer deer = new ReinDeer(5);
    System.out.println(","+deer.hasHorns());
  }
}
class ReinDeer extends Deer {
  public ReinDeer(int age) {System.out.print("ReinDeer");}
  public boolean hasHorns() {return true;}
}
