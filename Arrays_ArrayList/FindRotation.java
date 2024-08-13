package Arrays_ArrayList;

import java.util.Arrays;

public class FindRotation {

    public static void main(String[] args) {
        FindRotation fr = new FindRotation();

        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }

        };

        int[][] target = {

                { 7, 4, 1 },
                { 8, 5, 2 },
                { 9, 6, 3 }
        };

        boolean result = fr.findRotation(mat, target);
        System.out.println("Can the matrix be rotated to match the target? " + result);
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; ++i) { // (0, 90, 180, 270 degrees rotation
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            rotate(mat);
        }
        return false;
    }

    private void rotate(int[][] mat) {
        int n = mat.length;
        // Reverse the order of rows
        for (int i = 0, j = n - 1; i < j; ++i, --j) {
            int[] tmp = mat[i];
            mat[i] = mat[j];
            mat[j] = tmp;
        }
        // Transpose the matrix
        for (int r = 0; r < n; ++r) {
            for (int c = r + 1; c < n; ++c) {
                int tmp = mat[r][c];
                mat[r][c] = mat[c][r];
                mat[c][r] = tmp;
            }
        }
    }

}
