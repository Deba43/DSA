package Arrays_ArrayList;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int m = matrix.length, n = matrix[0].length;
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                mat[i][j] = matrix[j][i];
        System.out.println(Arrays.deepToString(mat));
    }

}
