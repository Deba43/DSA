package Searching;

public class ArrangingCoins {
    public static void main(String args[]) {

        int n = 5;
        long a = (long) n;

        long start = 0;
        long end = a;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * (mid + 1) <= 2 * a) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println((int) (start - 1));

    }

}
