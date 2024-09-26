import java.util.Scanner;

public class PerimeterEquilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the side of the equilateral triangle:");

        double a = sc.nextDouble();

        double pm = 3 * a;

        System.out.println("The perimeter of equilateral triangle with side " + a + " is " + pm);
        sc.close();
    }

}
