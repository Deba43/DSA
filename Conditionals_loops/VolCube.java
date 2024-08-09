import java.util.Scanner;

public class VolCube {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the side of the cube:");
        double a = sc.nextDouble();

        double vol = a * a * a;

        System.out.println("The volume of cube with side " + a + " is " + vol);

    }

}
