package Simple_Program;

import java.util.Scanner;

public class HCFLCM {

    public static void main(String[] args) {
        int num1, num2, temp1, temp2, gcd, lcm;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        num1 = sc.nextInt();

        System.out.print("Enter second number:");
        num2 = sc.nextInt();

        // Store original values for LCM calculation
        temp1 = num1;
        temp2 = num2;

        // Calculate GCD using the Euclidean algorithm
        while (temp2 != 0) {
            int temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }

        gcd = temp1;
        lcm = (num1 * num2) / gcd;

        System.out.print("GCD of " + num1 + " and " + num2 + " is " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);

        sc.close();
    }
}
