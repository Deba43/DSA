package Sorting;

import java.util.Arrays;

public class SquareSortedArray {
    public static void main(String[] args) {

        int arr[] = { -4, -1, 0, 3, 10 };
        System.out.println((Arrays.toString(sortedSquares(arr))));
    }

    static int[] sortedSquares(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }
        Arrays.sort(arr);
        return arr;

    }

}
