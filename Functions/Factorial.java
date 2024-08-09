package Functions;

public class Factorial {

    public static void main(String[] args) {
        Factorial fa = new Factorial();
        fa.fact(5);
    }

    public void fact(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        System.out.println("Factorial of " + n + " is " + f);
    }

}
