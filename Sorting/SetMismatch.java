package Sorting;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4 };
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] { arr[index], index + 1 };
            }

        }
        return new int[] { -1, -1 };
    }

}
