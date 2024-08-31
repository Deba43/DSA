package Searching;

public class MinInRotatedArray {
    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int pivot = findPivot(nums);

        if (pivot == -1) {
            return nums[0];
        }

        return nums[pivot + 1];
    }

    static int findPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        MinInRotatedArray mra = new MinInRotatedArray();

        int[] nums1 = { 3, 4, 5, 1, 2 };
        System.out.println("Minimum element in [3, 4, 5, 1, 2]: " + mra.findMin(nums1)); //

    }

}
