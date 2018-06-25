import java.util.*;

class TestC2 {
  public static void main(String... args) {

    ArrayList<ArrayList> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    list2.add("hawk");
    list2.add("Boolean.TRUE");
    list1.add(list2);
    System.out.println(list1.toString());
    }
}
