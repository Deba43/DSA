package Functions;

import java.util.Scanner;

public class CircumferenceAreaCircle {

    public static void main(String[] args) {
        CircumferenceAreaCircle c = new CircumferenceAreaCircle();
        c.area();
        c.circumference(3);

    }

    public int circumference(int r) {
        System.out.println("The circumference of circle with radius " + r + " is :" + (2 * Math.PI * r));
        return 0;
    }

    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        int a = sc.nextInt();

        double area = Math.PI * a * a;

        System.out.println("Area of circle is: " + area);
        sc.close();

    }

}
