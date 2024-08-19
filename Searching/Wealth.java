package Searching;

public class Wealth {
    public static void main(String[] args) {
        Wealth w = new Wealth();
        int[][] accounts = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int maxWealth = w.maximumWealth(accounts);
        System.out.println(maxWealth);
    }

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int row = 0; row < accounts.length; row++) {
            int temp = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                temp += accounts[row][col];
            }
            maxWealth = Math.max(maxWealth, temp);
        }

        return maxWealth;
    }

}
