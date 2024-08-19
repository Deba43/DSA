package Searching;

import java.util.Arrays;

public class SearchIn2dArrays {
    public static void main(String[] args) {
        int arr[][] = {
                { 45, 33, 22, 90, 490 },
                { 1, 29, 38 },
                { 99, 45, 77, 85 }
        };
        int target = 77;
        int ans[] = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] rows : arr) {
            for (int element : rows) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

}
