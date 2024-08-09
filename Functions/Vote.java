package Functions;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {

        Vote v = new Vote();
        v.vote();

    }

    public void vote() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }

}
