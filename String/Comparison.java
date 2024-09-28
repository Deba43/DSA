package String;

public class Comparison {
    public static void main(String[] args) {

        String a = "Deba";
        String b = "Deba";
        System.out.println(a == b);
        System.out.println(a.equals(b));

        String c = new String("Deba");
        String d = c;
        System.out.println(c == d);
        System.out.println(a == d);
        System.out.println(a.equals(c));

    }

}
