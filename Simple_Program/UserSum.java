package Simple_Program;

import java.util.Scanner;

public class UserSum {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Please enter two number");
        int num1 = abc.nextInt();
        int num2 = abc.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is:" + sum);
        abc.close();

    }

}
