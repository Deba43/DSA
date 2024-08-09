import java.util.Scanner;

public class VolPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the base area of the Prism:");

        double a = sc.nextDouble();

        System.out.print("What is the height of the Prism:");

        double h = sc.nextDouble();

        double vol = a * h;

        System.out.println("The Volume of Prism with base area " + a + " and height " + h + " is " + vol);
    }

}
