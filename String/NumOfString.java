package String;

public class NumOfString {
    public static void main(String[] args) {
        // String patterns[] = { "a", "abc", "bc", "d" }, word = "abc";
        // String patterns[] = { "a", "b", "c" }, word = "aaaaabbbbb";
        String patterns[] = { "a", "a", "a" }, word = "ab";
        int result = numOfStrings(patterns, word);
        System.out.println(result);
    }

    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                count++;
            }
        }
        return count;
    }

}
