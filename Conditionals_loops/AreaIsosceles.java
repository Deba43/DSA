import java.util.Scanner;

public class AreaIsosceles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the base of the triangle:");

        double b = sc.nextDouble();

        System.out.print("What is the height of the triangle:");

        double h = sc.nextDouble();

        double area = 0.5 * b * h;

        System.out.println("The area of Isosceles triangle with base " + b + " and height " + h + " is " + area);
    }

}
