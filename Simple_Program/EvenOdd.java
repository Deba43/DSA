package Simple_Program;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner ac = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = ac.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number " + num + " is even");
        } else {
            System.out.println("The number " + num + " is odd");
        }
        ac.close();
    }

}
