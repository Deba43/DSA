package Arrays_ArrayList;

import java.util.Arrays;

public class MatrixReshape {
    public static void main(String args[]) {
        int[][] nums = { { 1, 2 }, { 3, 4 } };
        int r = 1, c = 4;
        int m = nums.length, n = nums[0].length;

        if (m * n != r * c) {
            System.out.println(Arrays.deepToString(nums));
            return;
        }

        int[][] result = new int[r][c];
        int row = 0, col = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[row][col] = nums[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        System.out.println(Arrays.deepToString(result));
    }
}
