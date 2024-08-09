package Functions;

import java.util.Scanner;

public class GradeMarks {

    public static void main(String[] args) {
        GradeMarks g = new GradeMarks();
        g.gradeMarks();

    }

    public void gradeMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks:");
        int marks = sc.nextInt();

        if (marks >= 91 && marks <= 100) {
            System.out.println("Congratulation you have achieved grade O");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Congratulation you have achieved grade A");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Congratulation you have achieved grade B");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("You have achieved grade C");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("You have achieved grade D");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("You have achieved grade E");
        } else {
            System.out.println("You have failed in Exam");
        }
    }

}
