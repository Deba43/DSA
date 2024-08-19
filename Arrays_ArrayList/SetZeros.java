package Arrays_ArrayList;

public class SetZeros {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean isRow0 = false, isCol0 = false;

        // Check if the first row has any zeros
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                isRow0 = true;
            }
        }

        // Check if the first column has any zeros
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                isCol0 = true;
            }
        }

        // Use the first row and column to mark zeros
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set matrix elements to zero based on marks
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set the first row to zero if necessary
        if (isRow0) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Set the first column to zero if necessary
        if (isCol0) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        SetZeros sz = new SetZeros();

        int[][] matrix = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 0, 1, 1 }
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        sz.setZeroes(matrix);

        System.out.println("Matrix After setZeroes:");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}
