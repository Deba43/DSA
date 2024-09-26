import java.util.Scanner;

public class AreaParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the base of the Parallelogram:");

        double b = sc.nextDouble();

        System.out.print("What is the height of the Parallelogram:");

        double h = sc.nextDouble();

        double area = b * h;

        System.out.println("The area of Parallelogram with base " + b + " and height " + h + " is " + area);
        sc.close();
    }

}
