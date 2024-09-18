package Sorting;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int nums[] = { 3, 1, 2, 4 };

        System.out.println(Arrays.toString(sortArrayByParity(nums)));

    }

    public static int[] sortArrayByParity(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                int temp = nums[i];
                nums[i++] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }

}
