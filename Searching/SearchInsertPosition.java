package Searching;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 8;
        int result = searchInsert(nums, target);
        System.out.println(result);
    }

    public static int searchInsert(int[] A, int target) {
        int low = 0, high = A.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (A[mid] == target)
                return mid;
            else if (A[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;

        }
        return low;
    }

}
