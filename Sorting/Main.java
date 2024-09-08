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
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
