import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Write the salary of your income:");
        int salary = sc.nextInt();

        if (salary > 50000) {
            salary += 10000;
        } else if (salary > 40000) {
            salary += 7000;
        } else if (salary > 30000) {
            salary += 5000;
        } else if (salary > 20000) {
            salary += 3000;
        } else if (salary > 10000) {
            salary += 2000;
        }

        System.out.println("The salary after bonus is: " + salary);
    }

}
