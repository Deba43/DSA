public class SubOfProdandSumOfNum {

    public int num = 12345;

    public static void main(String[] args) {
        SubOfProdandSumOfNum s = new SubOfProdandSumOfNum();
        int product = s.prod();
        int sum = s.sum();
        System.out.println(product - sum);
    }

    public int prod() {
        int n = num;
        int ans = 1;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            ans = ans * rem;
        }
        return ans;
    }

    public int sum() {
        int n = num;
        int ans2 = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            ans2 = ans2 + rem;
        }
        return ans2;
    }
}
