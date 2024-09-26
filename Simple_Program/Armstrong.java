package Simple_Program;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number");
        int originalNumber = sc.nextInt();
        int number = originalNumber;
        int sum = 0;

        while (number > 0) {
            int rem = number % 10;
            number = number / 10;
            sum = sum + rem * rem * rem;
        }

        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
        sc.close();
    }
}
