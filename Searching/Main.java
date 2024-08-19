package Searching;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 4, 45, 33, 22, 90, 490, 777 };
        int target = 777;

        int ans = linearSearch(arr, target);
        if (ans != -1) {
            System.out.println("Target found at index: " + ans);
        } else {
            System.out.println("Target not found.");
        }

        boolean ans2 = linearSearch2(arr, target);
        System.out.println("Target found: " + ans2);
    }

    static int linearSearch(int arr[], int target) {
        if (arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static boolean linearSearch2(int arr[], int target) {
        if (arr.length == 0)
            return false;

        for (int i : arr) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }
}
