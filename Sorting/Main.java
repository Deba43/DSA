package Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 5, 1, 4 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        selection(arr);
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

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }

}
