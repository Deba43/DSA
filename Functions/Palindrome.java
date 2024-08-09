package Functions;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.palindrome("abcba");

    }

    public void palindrome(String str) {

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println(str + "is not a Palindrome number");
                return;
            }
            i++;
            j--;
        }
        System.out.println(str + " is Palindrome number");

    }

}
