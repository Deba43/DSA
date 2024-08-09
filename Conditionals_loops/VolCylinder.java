import java.util.Scanner;

public class VolCylinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the radius of the Cylinder:");

        double r = sc.nextDouble();

        System.out.print("What is the height of the Cylinder:");

        double h = sc.nextDouble();

        double vol = 3.14 * r * r * h;

        System.out.println("The volume of Cylinder with radius " + r + " and height " + h + " is " + vol);
    }

}
