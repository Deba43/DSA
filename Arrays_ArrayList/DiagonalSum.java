package Arrays_ArrayList;

public class DiagonalSum {
    public static void main(String args[]) {
        int[][] mat = { { 1, 1, 1, 1 },
                { 1, -1, -1, 1 },
                { 1, -1, -1, 1 },
                { 1, 1, 1, 1 } };

        System.out.println(diagonalSum(mat));

    }

    public static int diagonalSum(int[][] mat) {

        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[i][n - i - 1];
        }

        if (n % 2 != 0)
            sum -= mat[n / 2][n / 2];

        return sum;
    }

}