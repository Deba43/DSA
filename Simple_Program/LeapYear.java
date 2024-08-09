package Simple_Program;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Please enter the year");
        
        int yr = abc.nextInt();

        if((yr % 400 == 0) || ((yr % 4 == 0) && (yr % 100 != 0))) {
            System.out.println(yr + " is a Leap Year");
        } else {
            System.out.println(yr + " is not a Leap Year");
        }
    }
}
