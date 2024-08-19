package Arrays_ArrayList;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        // Reordering the array so that if the number `x` exists in the array,
        // it should be placed at index `x-1`.
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        // After reordering, the first index `i` that doesn't contain `i+1`
        // is the missing positive number.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all numbers are in place, the missing positive is `n+1`.
        return nums.length + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        FirstMissingPositive fmp = new FirstMissingPositive();

        int[] nums1 = { 3, 4, -1, 1 };
        int[] nums2 = { 1, 2, 0 };
        int[] nums3 = { 7, 8, 9, 11, 12 };

        System.out.println("First missing positive in nums1: " + fmp.firstMissingPositive(nums1)); // Expected: 2
        System.out.println("First missing positive in nums2: " + fmp.firstMissingPositive(nums2)); // Expected: 3
        System.out.println("First missing positive in nums3: " + fmp.firstMissingPositive(nums3)); // Expected: 1
    }

}
