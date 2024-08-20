package Searching;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        char target = 'z';

        SmallestLetter sl = new SmallestLetter();
        char result = sl.nextGreatestLetter(letters, target);
        System.out.println("The smallest letter greater than " + target + " is: " + result);
    }

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}
