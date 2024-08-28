package Searching;

public class PerfectSquare {
    public static void main(String args[]) {
        int[] testNumbers = { 16, 14, 25, 1, 0, 100, 2 };

        for (int num : testNumbers) {
            System.out.println("Is " + num + " a perfect square? " + isPerfectSquare(num));
        }
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 1)
            return false;
        long left = 1, right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == num)
                return true;
            if (mid * mid < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

}
