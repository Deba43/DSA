import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the radius of Circle:");

        double r = sc.nextDouble();

        double area = 3.14 * r * r;

        System.out.println("The area of circle with radius " + r + " is " + area);

    }

}
