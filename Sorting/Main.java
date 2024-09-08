package Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1, 0 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int arr[]) {
        boolean swapped;
        // Outer loop to iterate over each element
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false; // Initialize swapped to false at the start of each pass
            // Inner loop to compare adjacent elements
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Swap if the current element is greater than the next
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps were made in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
