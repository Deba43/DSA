package Functions;

import java.util.Scanner;

public class ProductTwoNum {
    public static void main(String[] args) {
        ProductTwoNum t = new ProductTwoNum();
        t.pNum();

    }

    public void pNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number");
        int b = sc.nextInt();

        int product = a * b;
        System.out.println("Product of " + a + " and " + b + " is: " + product);
        sc.close();
    }
}
