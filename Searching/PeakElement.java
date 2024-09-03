package Searching;

public class PeakElement {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0, high = m - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int maxRowIndex = findMaxIndex(mat, n, mid);

            int left = mid - 1 >= 0 ? mat[maxRowIndex][mid - 1] : -1;
            int right = mid + 1 < m ? mat[maxRowIndex][mid + 1] : -1;

            if (mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right) {
                return new int[] { maxRowIndex, mid };
            } else if (mat[maxRowIndex][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }

    public int findMaxIndex(int[][] mat, int n, int col) {
        int maxValue = -1;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (mat[i][col] > maxValue) {
                maxValue = mat[i][col];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        PeakElement pe = new PeakElement();

        int[][] mat1 = {
                { 1, 4, 3, 6 },
                { 7, 8, 9, 10 },
                { 5, 2, 1, 0 }
        };
        int[] result1 = pe.findPeakGrid(mat1);
        System.out.println("Peak found at: [" + result1[0] + ", " + result1[1] + "]");

        int[][] mat2 = {
                { 10, 20, 15 },
                { 21, 30, 14 },
                { 7, 16, 32 }
        };
        int[] result2 = pe.findPeakGrid(mat2);
        System.out.println("Peak found at: [" + result2[0] + ", " + result2[1] + "]");
    }
}
