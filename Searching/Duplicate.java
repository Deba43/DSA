package Searching;

public class Duplicate {
    public int findDuplicate(int[] nums) {
        int low = 1, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int a : nums) {
                if (a <= mid)
                    ++count;
            }
            if (count <= mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Duplicate d = new Duplicate();

        int[] nums = { 1, 3, 4, 2, 2 };

        int duplicate = d.findDuplicate(nums);
        System.out.println("The duplicate number is: " + duplicate);
    }

}
