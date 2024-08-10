package Arrays_ArrayList;

public class MaxWealth {

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4 }, { 5, 6, 7 } };
        int res = 0;

        for (int row = 0; row < arr.length; row++) {
            int temp = 0;
            for (int col = 0; col < arr[row].length; col++) {
                temp += arr[row][col];
            }
            res = Math.max(res, temp);
        }

        System.out.println(res);
    }

}
