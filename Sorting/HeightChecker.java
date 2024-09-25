package Sorting;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = { 1, 1, 4, 2, 1, 3 };
        System.out.println(heightChecker(heights));

    }

    public static int heightChecker(int[] heights) {
        int[] copy = heights.clone();
        Arrays.sort(copy);
        int count = 0;
        for (int i = 0; i < copy.length; i++) {
            if (heights[i] != copy[i])
                count++;
        }
        return count;
    }

}
