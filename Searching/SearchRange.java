package Searching;

public class SearchRange {
    public static void main(String[] args) {
        SearchRange sr = new SearchRange();
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 7;
        int[] result = sr.searchRange(nums, target);
        System.out.println("Range: [" + result[0] + ", " + result[1] + "]");
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findFirstLast(nums, target, true);
        ans[1] = findFirstLast(nums, target, false);
        return ans;
    }

    private int findFirstLast(int[] nums, int target, boolean first) {
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                idx = mid;
                if (first) {
                    end = mid - 1; // Continue to search on the left side for the first occurrence
                } else {
                    start = mid + 1; // Continue to search on the right side for the last occurrence
                }
            }
        }
        return idx;
    }
}
