import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        vc();

    }

    public static void vc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a alphabet:");
        char c = sc.next().charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'U') {
            System.out.println(c + " is a Vowel");
        } else {
            System.out.println(c + " is a Consonant");
        }
    }

}
