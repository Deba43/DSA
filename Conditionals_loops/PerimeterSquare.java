import java.util.Scanner;

public class PerimeterSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the side of the square:");

        double a = sc.nextDouble();

        double pm = 4 * a;

        System.out.println("The perimeter of square with side " + a + " is " + pm);
        sc.close();
    }

}
