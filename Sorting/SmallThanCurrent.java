package Sorting;

import java.util.Arrays;

public class SmallThanCurrent {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }

        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = count[nums[i] - 1];
            }
        }

        return result;
    }
}

// public int[] smallerNumbersThanCurrent(int[] nums) {

// Map<Integer, Integer> map = new HashMap<>();
// int[] copy = nums.clone();

// Arrays.sort(copy);

// for (int i = 0; i < nums.length; i++) {
// map.putIfAbsent(copy[i], i);
// }

// for (int i = 0; i < nums.length; i++) {
// copy[i] = map.get(nums[i]);
// }

// return copy;
// }