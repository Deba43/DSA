package Simple_Program;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = abc.nextInt();
        int flag = 0;

        if (num <= 1) {
            System.out.println(num + " is not prime number");
        } else {
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(num + " is not a prime number");
            } else {
                System.out.println(num + " is a prime number");
            }

        }
        abc.close();

    }
}
