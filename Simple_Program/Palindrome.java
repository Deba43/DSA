package Simple_Program;

import java.util.Scanner;

public class Palindrome 
{ 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();

        int i = 0;
        int j = str.length() - 1;
        
        boolean isPalindrome = true;
        while (i < j) 
        {
            if (str.charAt(i) != str.charAt(j)) 
            {   
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) 
        {

            System.out.println(str + " is a palindrome");
        } 
        else 
        {
            System.out.println(str + " is not a palindrome");
        }
    }   
}
