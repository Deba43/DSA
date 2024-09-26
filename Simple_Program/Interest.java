package Simple_Program;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Write the loan you want to take from bank:");
        int principal = a.nextInt();

        Scanner b = new Scanner(System.in);
        System.out.print("Write the time you can pay loan to the bank:");
        int time = b.nextInt();

        int rate_interest = 10;

        int si = (principal * time * rate_interest) / 100;

        System.out.println("The simple interest of " + principal + " in a time span of " + time + "yrs is " + si);
        int total_amount = principal + si;
        System.out.println("Amount that you have to pay to the bank at the end of the year is: " + total_amount);
        a.close();
        b.close();

    }

}
