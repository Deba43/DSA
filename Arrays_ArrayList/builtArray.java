package Arrays_ArrayList;

public class builtArray {

    public static void main(String[] args) {
        int nums[] = { 0, 2, 1, 5, 3, 4 };
        int[] result = bArray(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static int[] bArray(int nums[]) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }
}
