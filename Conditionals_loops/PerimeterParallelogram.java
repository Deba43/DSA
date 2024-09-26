import java.util.Scanner;

public class PerimeterParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the side of the parallelogram:");

        double a = sc.nextDouble();

        System.out.print("What is the base of parallelogram:");

        double b = sc.nextDouble();

        double pm = 2 * (a + b);

        System.out.println("The perimeter of parallelogram with side " + a + " and base " + b + " is " + pm);
        sc.close();
    }

}
