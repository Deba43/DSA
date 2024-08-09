package Functions;

public class EvenOdd {

    public static void main(String[] args) {
        EvenOdd e = new EvenOdd();
        e.evenOdd(9);
    }

    public void evenOdd(int num) {

        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }

    }

}
