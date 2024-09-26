import java.util.Scanner;

public class VolCone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the radius of the Cone:");

        double r = sc.nextDouble();

        System.out.print("What is the height of the Cone:");

        double h = sc.nextDouble();

        double vol = (3.14 * r * r * h) / 3;

        System.out.println("The volume of Cone with radius " + r + " and height " + h + " is " + vol);
        sc.close();
    }

}
