package Arrays_ArrayList;

public class MaximumSubarray {
    public static void main(String[] args) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum > max) {
                max = sum;
                start = tempStart;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Maximum sum: " + max);
        System.out.print("Maximum subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nIndices: [" + start + ", " + end + "]");
    }

}
