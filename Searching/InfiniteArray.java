package Searching;

public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = { 11, 18, 20, 22, 24, 27, 45, 55, 67, 69, 78, 89, 90, 94 };
        int target = 67;
        System.out.println(ans(arr, target));

    }

    static int ans(int arr[], int target) {

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);

    }

    static int binarySearch(int arr[], int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
