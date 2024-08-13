package Arrays_ArrayList;

public class TwoSum {
    public static void main(String args[]) {
        int[] nums = { 2, 7, 11, 4, 6 };
        int target = 13;

        int[] result = twoSum(nums, target);

        if (result.length == 0) {
            System.out.println("No solution found.");
        } else {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

}

// to print all the indices if there is one or more solutions found

class Solution {
    public static void main(String args[]) {
        int[] nums = { 5, 7, 1, 4, 6 };
        int target = 11;

        twoSum(nums, target);
    }

    public static void twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Indices: [" + i + ", " + j + "]");

                }
            }
        }

    }
}
