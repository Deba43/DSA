package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 8, 3, 4, 12, 5, 6, 7 };
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergeSort(int arr[]) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {

        int newArray[] = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                newArray[k] = first[i];
                i++;
            } else {
                newArray[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            newArray[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            newArray[k] = second[j];
            j++;
            k++;
        }
        return newArray;
    }

}
