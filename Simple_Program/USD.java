package Simple_Program;

import java.util.Scanner;

public class USD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter currency (1 for USD, 2 for INR):");
        int currency = in.nextInt();
        int fl;
        int usd = 80;

        if (currency == 1) {
            System.out.println("Enter amount in USD:");
            fl = in.nextInt();
            System.out.println("The amount of " + fl + "$" + " is " + fl * usd + " INR");
        } else if (currency == 2) {
            System.out.println("Enter amount in INR:");
            fl = in.nextInt();
            System.out.println("The amount of " + fl + " INR" + " is " + fl / usd + "$");
        } else {
            System.out.println("Invalid currency");
        }
        in.close();
    }
}
