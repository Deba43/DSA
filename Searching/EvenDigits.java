package Searching;

public class EvenDigits {
    public static void main(String[] args) {
        int arr[] = { 4, 45, 33, 22, 90, 490, 777 };
        int result = 0;

        for (int i = 0; i < arr.length; i++) {

            int count = (int) Math.log10(arr[i]) + 1;

            if (count % 2 == 0)
                result++;
        }

        System.out.println(result);
    }

}

// Alter
// class Solution {
// public int findNumbers(int[] nums) {
// int count = 0;
// for (int i = 0; i < nums.length; i++) {
// int digits = String.valueOf(nums[i]).length();

// if (digits % 2 == 0) {
// count++;
// }
// }
// return count;
// }
// }
