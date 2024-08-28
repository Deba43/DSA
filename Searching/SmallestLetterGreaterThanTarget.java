package Searching;

public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        SmallestLetterGreaterThanTarget slgtt = new SmallestLetterGreaterThanTarget();

        char[] letters1 = { 'c', 'f', 'j' };
        char target1 = 'a';
        System.out.println("Next greatest letter after 'a': " + slgtt.nextGreatestLetter(letters1, target1));

        char[] letters2 = { 'c', 'f', 'j' };
        char target2 = 'c';
        System.out.println("Next greatest letter after 'c': " + slgtt.nextGreatestLetter(letters2, target2));

        char[] letters3 = { 'c', 'f', 'j' };
        char target3 = 'd';
        System.out.println("Next greatest letter after 'd': " + slgtt.nextGreatestLetter(letters3, target3));

        char[] letters4 = { 'c', 'f', 'j' };
        char target4 = 'g';
        System.out.println("Next greatest letter after 'g': " + slgtt.nextGreatestLetter(letters4, target4));

        char[] letters5 = { 'c', 'f', 'j' };
        char target5 = 'j';
        System.out.println("Next greatest letter after 'j': " + slgtt.nextGreatestLetter(letters5, target5));
    }

    public char nextGreatestLetter(char[] letters, char target) {
        char res = letters[0];
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] == target) {
                start = mid + 1;
            } else if (target > letters[mid]) {
                start = mid + 1;
            } else if (letters[mid] > target) {
                res = letters[mid];
                end = mid - 1;
            }
        }
        return res;
    }

}
