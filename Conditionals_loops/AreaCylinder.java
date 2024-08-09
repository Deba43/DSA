import java.util.Scanner;

public class AreaCylinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the radius of the Cylinder:");

        double r = sc.nextDouble();

        System.out.print("What is the height of the Cylinder:");

        double h = sc.nextDouble();

        double area = 2 * 3.14 * r * r + 2 * 3.14 * r * h;

        System.out.println("The area of Cylinder with radius " + r + " and height " + h + " is " + area);

    }
}
