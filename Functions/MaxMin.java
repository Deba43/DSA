package Functions;

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        maxmin();
    }

    public static void maxmin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number");
        int c = sc.nextInt();

        int max, min;

        // Find maximum
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        // Find minimum
        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
