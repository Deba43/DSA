package String;

public class ExcelTitle {
    public static void main(String[] args) {
        // int columnNumber = 701;
        // int columnNumber = 5;
        int columnNumber = 28;
        String r = convertToTitle(columnNumber);
        System.out.println(r);

    }

    public static String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();

        while (n > 0) {
            n--;
            result.insert(0, (char) ('A' + n % 26));
            n /= 26;
        }
        return result.toString();
    }

}
