package String;

public class RestoreString {
    public static void main(String[] args) {

        String s = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };

        String result = restoreString(s, indices);
        System.out.println(result);

    }

    public static String restoreString(String s, int[] indices) {
        char[] c = new char[indices.length];
        for (int i = 0; i < indices.length; i++)
            c[indices[i]] = s.charAt(i);
        return new String(c);
    }

}
