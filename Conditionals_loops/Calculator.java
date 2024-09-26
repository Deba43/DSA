import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int cal = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the operator");

        char op = sc.next().charAt(0);

        System.out.print("Please enter two numbers");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (op == '+') {
            cal = num1 + num2;
        } else if (op == '-') {
            cal = num1 - num2;
        } else if (op == '*') {
            cal = num1 * num2;
        } else if (op == '/') {
            if (num2 == 0)
                System.out.println("Cann't divide by zero");
            cal = num1 / num2;
        } else {
            System.out.println("Invalid Operator");
        }

        System.out.println("The " + op + " of " + num1 + " and " + num2 + " is " + cal);
        sc.close();

    }
}