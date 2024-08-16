package Arrays_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> ls = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int num = Integer.MAX_VALUE;
            int index = -1;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < num) {
                    num = matrix[i][j];
                    index = j;
                }
            }
            boolean flag = true;
            for (int row = 0; row < n; row++) {
                if (matrix[row][index] > num) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ls.add(num);
            }
        }

        return ls;
    }

    public static void main(String[] args) {
        LuckyNumbers ln = new LuckyNumbers();

        int[][] matrix = {
                { 3, 7, 8 },
                { 9, 11, 13 },
                { 18, 16, 17 }
        };

        List<Integer> result = ln.luckyNumbers(matrix);

        System.out.println("Lucky Numbers: " + result);
    }

}
