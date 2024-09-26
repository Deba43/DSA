import java.util.Scanner;

public class AreaEquilateral {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the side of the triangle:");

        double a = sc.nextDouble();

        double area = (1.73 / 4) * a * a;

        System.out.println("The area of Equilateral triangle with side " + a + " is " + area);
        sc.close();
    }

}
