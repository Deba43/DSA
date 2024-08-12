package Arrays_ArrayList;

public class OddCells {
    public static void main(String args[]) {
        int m = 2, n = 2;
        int[][] indices = { { 1, 1 }, { 0, 0 } };
        System.out.println(oddCells(m, n, indices));

    }

    public static int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int row[] = new int[m];
        int col[] = new int[n];
        for (int x[] : indices) {
            row[x[0]]++;
            col[x[1]]++;
        }
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                if ((row[i] + col[j]) % 2 != 0)
                    count++;
            }
        return count;
    }

}
