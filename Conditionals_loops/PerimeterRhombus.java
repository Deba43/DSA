import java.util.Scanner;

public class PerimeterRhombus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the side of the rhombus:");

        double a = sc.nextDouble();

        double pm = 4 * a;

        System.out.println("The perimeter of rhombus with side " + a + " is " + pm);
    }

}
