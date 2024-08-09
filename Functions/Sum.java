package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // sum1();
        // int ans = sum2();
        // System.out.print(ans);

        int df = sum3(5, 7);
        System.out.println(df);

    }

    // static void sum1() {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter 1st number ");
    // int a = sc.nextInt();
    // System.out.print("Enter 2nd number ");
    // int b = sc.nextInt();
    // int sum = a + b;
    // System.out.println("Sum of " + a + " and " + b + " is " + sum);
    // }

    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number ");
        int b = sc.nextInt();
        int sum = a + b;
        return sum;

        // System.out.println("This statement will never execute after returning a
        // statement");

    }

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;

    }

}
