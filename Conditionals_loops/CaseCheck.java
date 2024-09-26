import java.util.Scanner;

public class CaseCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character you want:");

        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("The Character is in LowerCase");
        } else {
            System.out.println("The Character is in UpperCase");
        }
        sc.close();

    }

}
