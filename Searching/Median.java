package Searching;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int A[] = { 1, 3, 5, 7 };
        int B[] = { 2, 4, 6, 8 };
        int C[] = new int[A.length + B.length];

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
            System.out.print(C[i] + " ");
        }

        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
            System.out.print(B[i] + " ");
        }
        System.out.println();
        Arrays.sort(C);

        int totalElement = C.length;
        int mid = totalElement / 2;

        if (totalElement % 2 != 0) { // for odd number
            System.out.println("Median: " + C[mid]);
        } else { // for even number
            double median = (C[mid - 1] + C[mid]) / 2.0;
            System.out.println("Median: " + median);
        }
    }
}
