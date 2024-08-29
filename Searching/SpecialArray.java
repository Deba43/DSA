package Searching;

import java.util.Arrays;

public class SpecialArray {
    public static void main(String[] args) {
        SpecialArray sa = new SpecialArray();

        int[] nums1 = { 3, 5, 0, 6, 2, 7 };
        System.out.println("Special Array value for nums1: " + sa.specialArray(nums1));

        int[] nums2 = { 0, 4, 3, 0, 4 };
        System.out.println("Special Array value for nums2: " + sa.specialArray(nums2));

        int[] nums3 = { 3, 6, 7, 7, 0 };
        System.out.println("Special Array value for nums3: " + sa.specialArray(nums3));

        int[] nums4 = { 0, 0, 3, 4, 4 };
        System.out.println("Special Array value for nums4: " + sa.specialArray(nums4));
    }

    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int left = 0;
        int right = len - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= len - mid) {
                if (mid == 0 || nums[mid - 1] < len - mid) {
                    return len - mid;
                } else {
                    right = mid - 1;
                }
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

}
