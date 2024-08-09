package Functions;

public class StringExample {
    public static void main(String[] args) {
        // String s = greet();
        // System.out.println(s);

        // String ss = g();
        // System.out.println(ss);

        String a = myGreet("How are you");
        System.out.println(a);

    }

    static String myGreet(String s) {
        return s;

    }

    static String greet() {
        return "Hi";
    }

    static String g() {
        String s = "Hello";
        return s;
    }

}
