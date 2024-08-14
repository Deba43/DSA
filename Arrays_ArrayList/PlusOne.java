package Arrays_ArrayList;

import java.util.Arrays;

class PlusOne {
    public static void main(String args[]) {
        int digits[] = { 4, 3, 2, 9 };
        // int digits[] = { 4, 3, 2, 6 };
        // int digits[] = { 9, 9, 9, 9 };

        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return;
            }
            digits[i] = 0;
        }
        // If the loop completes, it means all digits were 9
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        System.out.println(Arrays.toString(newNumber));
    }
}
