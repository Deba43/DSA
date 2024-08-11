package Arrays_ArrayList;

public class GoodPairs {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, 1, 1, 2 };

        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
