package Searching;

class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { -1, 3, 4, 5, 6, 7 };
        int ans = search(arr, 3);
        System.out.println(ans);

    }

    public static int search(int[] nums, int target) {
        // if(nums == null || nums.length == 0) return -1;

        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

}
