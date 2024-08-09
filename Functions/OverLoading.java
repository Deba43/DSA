package Functions;

public class OverLoading {
    public static void main(String[] args) {
        fun(3, 7);
        fun("deba");

    }

    static void fun(int a, int b) {
        System.out.println(a + "" + b);

    }

    static void fun(String s) {
        System.out.println(s);

    }

}
