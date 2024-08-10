package Arrays_ArrayList;

import java.util.Arrays;

public class ConcatenationArray {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1 };
        int[] result = cArray(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] cArray(int arr[]) {
        int n = arr.length;
        int result[] = new int[n * 2];

        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
            result[i + n] = arr[i];
        }

        return result;
    }
}
