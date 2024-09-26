import java.util.Scanner;

public class LargestNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();
        System.out.print("Enter third number:");
        int c = sc.nextInt();

        // if (a > b && a > c) {
        // System.out.println(a + " is greater than " + b + " and " + c);
        // } else if (b > a && b > c) {
        // System.out.println(b + " is greater than " + a + " and " + c);
        // } else {
        // System.out.println(c + " is greater");
        // }

        int max = Math.max(c, Math.max(a, b));

        System.out.println("Maximum number is:" + max);
        sc.close();
    }

}
