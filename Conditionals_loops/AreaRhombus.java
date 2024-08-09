import java.util.Scanner;

public class AreaRhombus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("What is the 1st diagonal of Rhombus:");

        double d1 = sc.nextDouble();

        System.out.print("What is the 2nd diagonal of Rhombus:");

        double d2 = sc.nextDouble();

        double area = 0.5 * d1 * d2;

        System.out.println("The area of Rhombus with 1st diagonal " + d1 + " and 2nd diagonal " + d2 + " is " + area);
    }
}
