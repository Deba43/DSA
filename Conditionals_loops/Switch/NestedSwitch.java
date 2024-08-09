package Switch;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the id of Employee:");

        int id = sc.nextInt();
        System.out.print("Enter the company of Employee:");
        String company = sc.next();

        switch (id) {
            case 1:
                System.out.println("The name of Employee is Rahul");
                break;

            case 2:
                System.out.println("The name of Employee is Rishab");
                break;

            case 3:
                System.out.println("The name of Employee is Tushar");
                switch (company) {
                    case "Flipkart":
                        System.out.println("Flipkart");
                        break;

                    case "Swiggy":
                        System.out.println("Swiggy");
                        break;

                    default:
                        System.out.println("This is not a valid company");
                }
                break;
            default:
                System.out.println("Enter correct Employee ID");
        }
    }
}
