package String;

public class ReverseWords {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String r = reverseWords(s);
        System.out.println(r);
    }

    public static String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String[] words = s.split(" ");

        for (String word : words) {
            StringBuilder temp = new StringBuilder(word);
            temp.reverse();
            str.append(temp);
            str.append(" ");
        }
        return str.toString().trim();
    }

}
