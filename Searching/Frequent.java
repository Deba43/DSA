package Searching;

import java.util.Arrays;

public class Frequent {
    public int maxFrequency(int[] A, long k) {
        int i = 0, j;
        Arrays.sort(A);
        for (j = 0; j < A.length; ++j) {
            k += A[j];
            if (k < (long) A[j] * (j - i + 1)) {
                k -= A[i++];
            }
        }
        return j - i;
    }

    public static void main(String[] args) {
        Frequent f = new Frequent();

        int[] A1 = { 1, 2, 4 };
        long k1 = 5;
        System.out.println("Max Frequency: " + f.maxFrequency(A1, k1));

        int[] A2 = { 3, 9, 6 };
        long k2 = 2;
        System.out.println("Max Frequency: " + f.maxFrequency(A2, k2));

        int[] A3 = { 1, 4, 8, 13 };
        long k3 = 5;
        System.out.println("Max Frequency: " + f.maxFrequency(A3, k3));
    }

}
