package Functions;

public class PrimeNumBetweenTwoNum {
    public static void main(String[] args) {
        prime(10, 20);
    }

    public static void prime(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
