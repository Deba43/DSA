import java.util.Scanner;

public class AreaRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the length of the Rectangle:");

        double l = sc.nextDouble();

        System.out.print("What is the width of the Rectangle:");

        double w = sc.nextDouble();

        double area = l * w;

        System.out.println("The area of Rectangle with length " + l + " and width " + w + " is " + area);
        sc.close();
    }
}
