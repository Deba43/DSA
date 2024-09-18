package Sorting;

import java.util.Arrays;

public class ArrayByParity {
    public static void main(String[] args) {
        int[] nums = { 4, 2, 5, 7 };
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }

    public static int[] sortArrayByParityII(int[] nums) {

        int even = 0;
        int odd = 1;

        while (even < nums.length && odd < nums.length) {
            if (nums[even] % 2 != 0) {
                swap(nums, even, odd);
                odd += 2;
            } else {
                even += 2;
            }
        }

        return nums;
    }

    private static void swap(int[] nums, int even, int odd) {
        int temp = nums[even];
        nums[even] = nums[odd];
        nums[odd] = temp;
    }

}
