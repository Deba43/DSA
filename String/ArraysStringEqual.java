package String;

public class ArraysStringEqual {
    public static void main(String[] args) {

        // String[] word1 = { "ab", "c" }, word2 = { "a", "bc" };
        // String[] word1 = { "a", "cb" }, word2 = { "ab", "c" };
        String[] word1 = { "abc", "d", "defg" }, word2 = { "abcddefg" };
        boolean b = arrayStringsAreEqual(word1, word2);
        System.out.println(b);

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            sb2.append(word2[i]);
        }

        if (sb1.toString().equals(sb2.toString())) {
            return true;
        }

        return false;
    }
}
