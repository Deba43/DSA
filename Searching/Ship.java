package Searching;

public class Ship {
    public int shipWithinDays(int[] weights, int D) {
        int left = 0, right = 0;
        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }
        while (left < right) {
            int mid = left + (right - left) / 2, need = 1, cur = 0;
            for (int w : weights) {
                if (cur + w > mid) {
                    need += 1;
                    cur = 0;
                }
                cur += w;
            }
            if (need > D)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        Ship s = new Ship();

        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int D = 5;

        int result = s.shipWithinDays(weights, D);
        System.out.println("Minimum ship capacity required: " + result);
    }

}
