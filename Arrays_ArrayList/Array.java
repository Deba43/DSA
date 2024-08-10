package Arrays_ArrayList;

import java.util.ArrayList;

public class Array {

  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>(5);

    list.add(7);
    list.add(12);
    list.add(2);
    list.add(9);
    System.out.println(list);

    System.out.println(list.add(77));
    System.out.println(list);
    System.out.println(list.contains(4));
    list.set(3, 43);
    System.out.println(list);
    list.remove(0);
    System.out.println(list);
  }

}