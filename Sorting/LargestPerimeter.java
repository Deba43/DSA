package Sorting;

import java.util.Arrays;

public class LargestPerimeter {
    public static void main(String[] args) {
        int nums[] = { 2, 1, 3, 4 };

        System.out.println(largestPerimeter(nums));
    }

    public static int largestPerimeter(int[] nums) {

        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 1; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2])
                return nums[i] + nums[i - 1] + nums[i - 2];
        }
        return 0;
    }

}
