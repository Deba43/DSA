package String;

public class MergeAlter {
    public static void main(String[] args) {
        // String word1 = "abc", word2 = "pqr";
        // String word1 = "ab", word2 = "pqrs";
        String word1 = "abcd", word2 = "pq";
        String re = mergeAlternately(word1, word2);
        System.out.println(re);
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder m = new StringBuilder("");
        int i = 0;
        int l = Math.max(word1.length(), word2.length());
        while (i < l) {
            if (i < word1.length()) {
                m.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                m.append(word2.charAt(i));
            }
            i++;
        }
        return m.toString();
    }

}