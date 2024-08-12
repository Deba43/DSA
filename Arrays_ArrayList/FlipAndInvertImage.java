package Arrays_ArrayList;

import java.util.Arrays;

public class FlipAndInvertImage {
    public static int[][] flipAndInvertImage(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int low = 0, high = arr[i].length - 1;
            while (low <= high) {
                if (arr[i][low] == arr[i][high]) {
                    arr[i][low] = 1 - arr[i][low];
                    arr[i][high] = arr[i][low];
                }
                low++;
                high--;
            }
        }

        return arr;
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int result[][] = flipAndInvertImage(arr);
        System.out.println(Arrays.deepToString(result));

    }

}
