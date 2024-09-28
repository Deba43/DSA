package String;

public class Palindrome {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // sb.append("madm");
        // sb.reverse();
        // System.out.println(sb);

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb);

    }

}
