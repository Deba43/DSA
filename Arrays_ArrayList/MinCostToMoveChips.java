package Arrays_ArrayList;

public class MinCostToMoveChips {
    public static void main(String[] args) {
        int[] position = { 1, 1, 1, 3, 3, 4 };
        int even = 0, odd = 0;

        for (int p : position) {
            if (p % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println(Math.min(even, odd));
    }

}
