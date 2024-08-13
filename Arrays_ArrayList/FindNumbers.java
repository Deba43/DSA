package Arrays_ArrayList;

public class FindNumbers {
    public static void main(String[] args) {
        int nums[] = { 12, 345, 22, 6, 7896 };
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int digits = String.valueOf(nums[i]).length();

            if (digits % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}

// class Solution {
// public static void main(String[] args) {
// int nums[] = {12, 345, 22, 6, 7896};
// int count = 0;

// for (int i = 0; i < nums.length; i++) {
// if ((nums[i] > 9 && nums[i] < 100) || (nums[i] > 999 && nums[i] < 10000) ||
// nums[i] == 100000) {
// count++;
// }
// }

// System.out.println(count);
// }
// }
