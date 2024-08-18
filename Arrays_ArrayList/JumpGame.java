package Arrays_ArrayList;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable)
                return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        JumpGame jg = new JumpGame();

        int[] nums1 = { 2, 3, 1, 1, 4 };
        int[] nums2 = { 3, 2, 1, 0, 4 };

        System.out.println("Can jump in nums1: " + jg.canJump(nums1));
        System.out.println("Can jump in nums2: " + jg.canJump(nums2));
    }

}
