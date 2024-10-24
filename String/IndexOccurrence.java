package String;

public class IndexOccurrence {
    public static void main(String[] args) {
        // String haystack = "sadbutsad", needle = "sad";
        String haystack = "leetcode", needle = "leeto";
        int result = strStr(haystack, needle);
        System.out.println(result);
    }

    public static int strStr(String haystack, String needle) {
        for (int i = 0;; i++) {
            for (int j = 0;; j++) {
                if (j == needle.length())
                    return i;
                if (i + j == haystack.length())
                    return -1;
                if (needle.charAt(j) != haystack.charAt(i + j))
                    break;
            }
        }
    }

}
