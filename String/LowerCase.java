package String;

public class LowerCase {
    public static void main(String[] args) {

        String s = "AbcD";
        String r = toLowerCase(s);
        System.out.println(r);

    }

    public static String toLowerCase(String s) {
        // return s.toLowerCase();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90) {
                c = (char) (c + 32);

            }
            ans.append(c);
        }
        return ans.toString();

    }

}
