package String;

public class StringHalvesAlike {
    public static void main(String[] args) {

        // String s = "book";
        String s = "textbook";
        boolean b = halvesAreAlike(s);
        System.out.println(b);

    }

    public static boolean halvesAreAlike(String s) {

        int n = s.length();
        int count1 = 0;
        int count2 = 0;
        char[] vowels = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };
        int i = 0;
        int j = n / 2;
        while (i < n / 2 && j < n) {
            for (int c = 0; c < vowels.length; c++) {
                if (vowels[c] == s.charAt(i)) {
                    count1++;
                }
                if (vowels[c] == s.charAt(j)) {
                    count2++;
                }
            }

            i++;
            j++;
        }
        if (count1 == count2) {
            return true;
        }
        return false;
    }

}
