import java.util.Scanner;

public class AreaCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the edge of cube:");

        int e = sc.nextInt();

        int area = 6 * e * e;

        System.out.println("The area of cube with edge " + e + " is " + area);
        sc.close();

    }

}
