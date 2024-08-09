import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the length of the rectangle:");

        double l = sc.nextDouble();

        System.out.print("What is the width of rectangle:");

        double w = sc.nextDouble();

        double pm = 2 * (l + w);

        System.out.println("The perimeter of rectangle with length " + l + " and width " + w + " is " + pm);
    }

}
