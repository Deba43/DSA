package String;

public class SortingTheSentence {
    public static void main(String[] args) {

        String s = "Myself2 Me1 I4 and3";
        String re = sortSentence(s);
        System.out.println(re);

    }

    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] bucket = new String[words.length];
        for (String word : words) {

            int index = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
            bucket[index] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", bucket);
    }

}
