package Simple_Program;

import java.util.Scanner;

public class LargeNum {
    public static void main(String[] args) {

        Scanner abc = new Scanner(System.in);
        System.out.println("Please enter two number");
        int num1 = abc.nextInt();
        int num2 = abc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num1 + " is less than " + num2);
        }
        abc.close();
    }

}
