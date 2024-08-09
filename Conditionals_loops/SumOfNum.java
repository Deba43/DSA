public class SumOfNum {

    public static void main(String[] args) {

        int num = 12345;

        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;

            ans = ans + rem;
        }
        System.out.println(ans);
    }
}
