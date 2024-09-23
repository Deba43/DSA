package Sorting;

import java.util.Arrays;

public class AverageSalary {
    public static void main(String[] args) {
        int[] salary = { 4000, 3000, 1000, 2000 };
        System.out.println(average(salary));
    }

    public static double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0, count = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
            count++;
        }
        double avg = sum / count;
        return avg;

    }

}

// public double average(int[] salary) {
// int min = Integer.MAX_VALUE;
// int max = Integer.MIN_VALUE;
// int sum =0;

// for (int i =0; i<salary.length; i++){
// min = Math.min(min , salary[i]);
// max = Math.max(max , salary[i]);
// sum += salary[i];
// }
// double newSum = sum -min-max;
// double newLength = salary.length -2;
// double avg = newSum / newLength;
// return avg;
// }
