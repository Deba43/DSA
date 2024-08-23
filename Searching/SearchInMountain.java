package Searching;

public class SearchInMountain {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        System.out.println(search(arr, 5));
        System.out.println(search(arr, 1));
    }

    static int search(int arr[], int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // Search in the second half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    public static int peakIndexInMountainArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int arr[], int target, int start, int end) {

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
