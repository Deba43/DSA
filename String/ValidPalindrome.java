package String;

public class ValidPalindrome {
    public static void main(String[] args) {
        // String s = "race a car";
        // String s = " ";
        String s = "A man, a plan, a canal: Panama";
        boolean r = isPalindrome(s);
        System.out.println(r);
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
