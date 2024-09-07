package Searching;

public class SmallerNumber {
    public static void main(String[] args) {
        int nums[] = { 1 };
        int res[] = new int[nums.length];

        if (nums.length == 1)
            System.out.println("Array has only one element.");
        System.exit(0);

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] > nums[j])
                    count++;
            }
            res[i] = count;
        }
        for (int n : res)
            System.out.print(n + " ");
    }

}
