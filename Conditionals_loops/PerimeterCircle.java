import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the radius of the Circle:");

        double r = sc.nextDouble();

        double pm = 2 * 3.14 * r;

        System.out.println("The perimeter of Circle with radius " + r + " is " + pm);
    }

}
