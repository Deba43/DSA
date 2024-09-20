package Sorting;

public class SpecialArray {
    public static void main(String[] args) {

        int[] nums1 = { 0, 4, 3, 0, 4 };
        System.out.println(specialArray(nums1));

    }

    public static int specialArray(int[] nums) {
        int low = 0;
        int high = nums.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = countF(nums, mid);
            if (count < mid)
                high = mid - 1;
            else if (count > mid)
                low = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static int countF(int[] nums, int mid) {
        int count = 0;
        for (int c : nums) {
            if (c >= mid)
                count++;
        }
        return count;
    }

}
