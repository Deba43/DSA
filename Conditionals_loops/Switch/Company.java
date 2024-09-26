package Switch;

import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Company name:");
        String com = sc.next();

        // switch (com) {
        // case "Mahindra":
        // System.out.println("This is an Indian Company");
        // break;

        // case "Tata":
        // System.out.println("This is an Indian Company");
        // break;

        // case "Vivo":
        // System.out.println("This is a Chienese Company");
        // break;

        // case "Lamborghini":
        // System.out.println("This is an Italian Company");
        // break;

        // case "OYO":
        // System.out.println("This is an Indian Company");
        // break;

        // default:
        // System.out.println("This Company isn't saved in our database please contact
        // admin for more details");

        // }

        // Enhanced Switch Statement

        // switch (com) {
        // case "Mahindra" -> System.out.println("This is an Indian Company");
        // case "Tata" -> System.out.println("This is an Indian Company");
        // case "Vivo" -> System.out.println("This is an chienese Company");
        // case "Lamborghini" -> System.out.println("This is an Italian Company");
        // case "OYO" -> System.out.println("This is an Indian Company");
        // default ->
        // System.out.println("This Company isn't saved in our database please contact
        // admin for more details");

        // }

        switch (com) {
            case "Mahindra", "Tata", "OYO", "Flipkart", "Paytm", "Swiggy", "Zomato" ->
                System.out.println("This is an Indian Company");
            case "Vivo" -> System.out.println("This is a Chienese Company");
            case "Lamborghini" -> System.out.println("This is an Italian Company");

            default ->
                System.out.println("This Company isn't saved in our database please contact admin for more details");

        }
        sc.close();
    }

}
