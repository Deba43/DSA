package Sorting;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        int result[] = sortColors(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortColors(int[] A) {
        if (A == null || A.length < 2)
            return A;
        int low = 0;
        int high = A.length - 1;
        for (int i = low; i <= high;) {
            if (A[i] == 0) {

                int temp = A[i];
                A[i] = A[low];
                A[low] = temp;
                i++;
                low++;
            } else if (A[i] == 2) {

                int temp = A[i];
                A[i] = A[high];
                A[high] = temp;
                high--;
            } else {
                i++;
            }
        }
        return A;
    }

}
