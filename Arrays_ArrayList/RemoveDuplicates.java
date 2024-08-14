package Arrays_ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 2, 2, 3, 3, 4 };
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println(j);
    }

}
