package Sorting;

import java.util.Arrays;

public class ArithmaticProgression {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 1 };
        boolean ans = canMakeArithmeticProgression(arr);
        System.out.println(ans);
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);
        int a = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (a != arr[i] - arr[i - 1])
                return false;
        }
        return true;

    }

}
