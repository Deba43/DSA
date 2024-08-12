package Arrays_ArrayList;

public class HighestAltitude {
    public static void main(String args[]) {
        int[] gain = { -5, 1, 5, 0, -7 };
        int sum = 0;
        int max = 0;

        for (int i = 0; i < gain.length; i++) {
            sum = gain[i] + sum;
            if (sum > max)
                max = sum;
        }
        System.out.println(max);
    }

}
