package Arrays_ArrayList;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int arr[] = { 25, 43, 7, 16, 34, 52, 61 };
        swap(arr, 2, 5);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int swap(int arr[], int index_1, int index_2) {
        int temp = arr[index_1];
        arr[index_1] = arr[index_2];
        arr[index_2] = temp;

        return 0;

    }

    static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

}
