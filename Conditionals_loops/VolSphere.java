import java.util.Scanner;

public class VolSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the radius of the Sphere:");

        double r = sc.nextDouble();

        double vol = (4 * 3.14 * r * r * r) / 3;

        System.out.println("The volume of sphere with radius " + r + " is " + vol);
    }

}
