package Searching;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 16;
        int result = mySqrt(x);
        System.out.println("The integer square root of " + x + " is: " + result);
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int low = 1, high = x, ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x / mid == mid)
                return mid;
            else if (x / mid < mid)
                high = mid - 1;
            else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

}
