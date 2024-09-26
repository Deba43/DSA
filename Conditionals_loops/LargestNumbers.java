public class LargestNumbers {

    public static void main(String[] args) {

        int a[] = { 10, 20, 30, 40, 50 };
        int j = 0;

        for (int i = 0; i < a.length - 1; i++) {
            j++;
            if (a[i] > a[j]) {
                System.out.println(a[i]);
            }

        }
        System.out.println("The largest number is:" + a[j]);

    }

}
