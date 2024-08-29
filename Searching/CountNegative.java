package Searching;

public class CountNegative {
    public static void main(String[] args) {
        int arr[][] = {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2 },
                { -1, -1, -2, -3 }
        };
        int result = countNegatives(arr);
        System.out.println(result);
    }

    public static int countNegatives(int[][] grid) {
        int row = 0;
        int col = grid[0].length - 1;
        int count = 0;

        while (row < grid.length && col >= 0) {
            if (grid[row][col] < 0) {
                count += grid.length - row;
                col--;
            } else {
                row++;
            }
        }
        return count;
    }

    // Brute Force Method
    public static int countNegatives2(int[][] grid) {

        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] < 0)
                    count++;
            }
        }
        return count;

    }

}
