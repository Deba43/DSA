package Searching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int arr[] = { 2, 19, 27, 36, 45, 54, 63, 72, 88 };
        int arr[] = { 88, 72, 63, 54, 45, 36, 27, 19, 2 };
        int target = 63;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }

    static int orderAgnosticBS(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

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
