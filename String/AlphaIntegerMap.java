package String;

public class AlphaIntegerMap {
    public static void main(String[] args) {
       // String s = "10#11#12";
        String s = "1326#";
        String r = freqAlphabets(s);
        System.out.println(r);

    }

    public static String freqAlphabets(String s) {
        int i = s.length() - 1;

        StringBuilder str = new StringBuilder();

        while (i >= 0) {
            if (s.charAt(i) == '#') {
                if (s.charAt(i - 2) == '1') {
                    str.append((char) ('j' + s.charAt(i - 1) - '0'));
                } else {
                    str.append((char) ('j' + s.charAt(i - 1) - '0' + 10));
                }
                i -= 3;
            } else {
                str.append((char) ('a' + s.charAt(i) - '0' - 1));
                i--;
            }
        }

        return str.reverse().toString();
    }

}
