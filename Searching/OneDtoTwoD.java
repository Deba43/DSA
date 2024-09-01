package Searching;

public class OneDtoTwoD {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }
        int[][] ans = new int[m][n];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                ans[row][col] = original[row * n + col];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        OneDtoTwoD ot = new OneDtoTwoD();

        int[] original1 = { 1, 2, 3, 4 };
        int m1 = 2, n1 = 2;
        int[][] result1 = ot.construct2DArray(original1, m1, n1);
        print2DArray(result1);

        int[] original2 = { 1, 2, 3 };
        int m2 = 1, n2 = 3;
        int[][] result2 = ot.construct2DArray(original2, m2, n2);
        print2DArray(result2);

        int[] original3 = { 1, 2, 3, 4 };
        int m3 = 3, n3 = 2;
        int[][] result3 = ot.construct2DArray(original3, m3, n3);
        print2DArray(result3); // Expected output: []

        int[] original4 = { 1, 2, 3, 4, 5, 6 };
        int m4 = 2, n4 = 3;
        int[][] result4 = ot.construct2DArray(original4, m4, n4);
        print2DArray(result4);
    }

    private static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}
