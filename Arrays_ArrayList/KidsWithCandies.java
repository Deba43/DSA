package Arrays_ArrayList;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        int maxCandies = 0;

        for (int candy : candies) {
            maxCandies = Math.max(candy, maxCandies);
        }

        boolean[] result = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            result[i] = candies[i] + extraCandies >= maxCandies;
        }

        for (boolean canHaveMax : result) {
            System.out.println(canHaveMax);
        }
    }

}
