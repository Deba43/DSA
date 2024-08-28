package Searching;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {

        int[] nums1 = { 2, 3, 4, 7, 11 };
        int k1 = 5;
        System.out.println("The 5th missing positive integer is: " + findKthPositive(nums1, k1));

        int[] nums2 = { 1, 2, 3, 4 };
        int k2 = 2;
        System.out.println("The 2nd missing positive integer is: " + findKthPositive(nums2, k2));

        int[] nums3 = { 1, 3, 4, 5 };
        int k3 = 1;
        System.out.println("The 1st missing positive integer is: " + findKthPositive(nums3, k3));

        int[] nums4 = { 2, 3, 4, 7, 11 };
        int k4 = 1;
        System.out.println("The 1st missing positive integer is: " + findKthPositive(nums4, k4));
    }

    public static int findKthPositive(int[] nums, int k) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] - mid - 1 < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left + k;
    }

}
