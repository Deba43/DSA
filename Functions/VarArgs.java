package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        multiple(2, 3, "Debadatta", "Rahul", "jndwyw");
        demo(1, 2, 3);

        demo("one", "two", "three");
    }

    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String... v) {
        System.out.println("a: " + a + ", b: " + b + ", v: " + Arrays.toString(v));
    }

}
