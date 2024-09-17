package Sorting;

import java.util.Arrays;

//TC - O(nlogn) , SC - O(1)
class MaximumProduct {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(maximumProduct(nums));

    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 3) {
            int product = 1;
            for (int i = 0; i < nums.length; i++) {
                product *= nums[i];
            }
            return product;
        } else {
            int prod1 = 1;
            for (int j = nums.length - 1; j >= nums.length - 3; j--) {
                prod1 *= nums[j];
            }
            int prod2 = nums[0] * nums[1] * nums[nums.length - 1];
            return Math.max(prod1, prod2);
        }
    }
}

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int prod1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length
                - 3];
        int prod2 = nums[0] * nums[1] * nums[nums.length - 1];
        return Math.max(prod1, prod2);
    }
}
