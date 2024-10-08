package Sorting;

public class MaxProduct {
    public static void main(String[] args) {

        int[] nums = { 3, 4, 5, 2 };

        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num >= max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}
