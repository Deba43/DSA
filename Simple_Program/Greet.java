package Simple_Program;

import java.util.Scanner;

public class Greet 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println("Good Morning " + name);
    }
}
