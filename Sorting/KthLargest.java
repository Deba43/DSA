package Sorting;

import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        int result = findKthLargest(nums, k);
        System.out.println(result);

    }

    public static int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];

    }

}

// class Solution {
// public int findKthLargest(int[] nums, int k) {
// int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
// for(int i = 0; i < nums.length; i++) {
// if (nums[i] > max) max = nums[i];
// if (nums[i] < min) min = nums[i];
// }

// int[] counts = new int[max+1-min];
// for (int i = 0; i < nums.length; i++) counts[nums[i]-min]++;

// for (int i = counts.length-1; i >= 0;i--) {
// k -= counts[i];
// if (k <= 0) return i + min;
// }
// return -1;
// }
// }
