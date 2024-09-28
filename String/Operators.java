package String;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        System.out.println('a' + 'b');
        System.out.println('a');
        System.out.println("a" + "b");
        System.out.println("a" + 'b');

        System.out.println((char) ('a' + 3));

        System.out.println("a" + 1);

        System.out.println("Debadatta" + new ArrayList<>());
        System.out.println("Deba " + new Integer(7));

        String x = new Integer(34) + " " + new ArrayList<>();
        System.out.println(x);

        String b = "Deba";
        b.concat("datta");
        System.out.println(b);

        String b1 = b.concat("datta");
        System.out.println(b1);

        System.out.println(b + " " + b1);

    }

}
