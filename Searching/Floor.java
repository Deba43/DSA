package Searching;

public class Floor {
    public static void main(String[] args) {
        int arr[] = { 2, 19, 27, 36, 45, 54, 63, 72, 88 };
        int target = 72;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    static int floor(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

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
        return end;
    }

}
