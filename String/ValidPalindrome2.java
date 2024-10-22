package String;

public class ValidPalindrome2 {
    public static void main(String[] args) {

        // String s = "aba";
        // String s = "abca";
        String s = "abc";
        boolean r = validPalindrome(s);
        System.out.println(r);

    }

    public static boolean validPalindrome(String s) {
        int n = s.length();
        int l = 0, r = n - 1;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else
                return (dfs(s, l + 1, r) || dfs(s, l, r - 1));
        }
        return true;
    }

    static boolean dfs(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else
                return false;
        }
        return true;
    }

}
