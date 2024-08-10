package Arrays_ArrayList;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2 };
        int n = nums.length / 2;

        int[] shuffled = shuffle(nums, n);
        System.out.println(Arrays.toString(shuffled));
    }

    public static int[] shuffle(int nums[], int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];

        }
        return result;

    }

}
