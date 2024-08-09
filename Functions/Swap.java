package Functions;

public class Swap {
    public static void main(String[] args) {
        int a = 9, b = 7;
        // int temp = a;
        // a = b;
        // b = temp;

        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Debadatta Behera";
        changeName(name);
        System.out.println(name);

    }

    static void changeName(String naam) {
        naam = "Rahul"; // creating a new object
    }

    static void swap(int a, int b) {

    }

}
