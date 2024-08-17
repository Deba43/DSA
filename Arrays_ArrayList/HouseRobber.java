package Arrays_ArrayList;

public class HouseRobber {
    public static int rob(int[] nums) {
        int n = nums.length;
        int a = 0;
        int b = 0;

        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a = Math.max(a + nums[i], b);
            } else {
                b = Math.max(a, b + nums[i]);
            }
        }

        return Math.max(a, b);
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 9, 3, 1 };
        int maxRobbedAmount = rob(nums);

        System.out.println("Maximum amount that can be robbed: " + maxRobbedAmount);
    }

}
