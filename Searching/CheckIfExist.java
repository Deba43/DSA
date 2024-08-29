package Searching;

import java.util.Arrays;

public class CheckIfExist {

    public static void main(String[] args) {

        int num[] = { 10, 2, 5, 3 };
        boolean b = checkIfExist(num);
        System.out.println(b);

    }

    // 5ms
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int target = 2 * arr[i];
            int low = 0, high = arr.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == target && mid != i)
                    return true;
                if (arr[mid] < target)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return false;
    }

    // Brute force Method
    // 2ms
    public boolean checkIfExist2(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j] && i != j)
                    return true;
            }
        }
        return false;

    }

}
