package Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {

        int[] num1 = { 1, 2, 2, 1 };
        int[] num2 = { 2, 2 };

        int[] result = intersect(num1, num2);

        System.out.println("Intersection: " + Arrays.toString(result));
    }

    public static int[] intersect(int[] num1, int[] num2) {
        Arrays.sort(num1);
        Arrays.sort(num2);
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < num1.length && j < num2.length) {
            if (num1[i] == num2[j]) {
                list.add(num1[i]);
                i++;
                j++;
            } else if (num1[i] < num2[i]) {
                i++;
            } else {
                j++;
            }
        }
        int[] res = new int[list.size()];
        for (int k = 0; k < res.length; k++)
            res[k] = list.get(k);
        return res;
    }

}
