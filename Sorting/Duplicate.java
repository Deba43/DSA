package Sorting;

import java.util.HashSet;

class Duplicate {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        boolean result = containsDuplicate(nums);
        System.out.println("Contains duplicate: " + result);
    }

    public static boolean containsDuplicate(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
