package Arrays_ArrayList;

import java.util.Arrays;

public class SumZero {
    public static void main(String args[]) {
        int result[] = sumZero(5);
        System.out.println(Arrays.toString(result));

    }

    public static int[] sumZero(int n) {
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = i * 2 - n + 1;
        }
        return A;

    }
}
