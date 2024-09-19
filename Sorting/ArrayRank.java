package Sorting;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayRank {
    public static void main(String[] args) {
        int arr[] = { 37, 12, 28, 9, 100, 56, 80, 5, 12 };
        int result[] = arrayRankTransform(arr);
        System.out.println(Arrays.toString(result));

    }

    public static int[] arrayRankTransform(int[] arr) {
        int[] A = Arrays.copyOf(arr, arr.length);
        Arrays.sort(A);
        HashMap<Integer, Integer> rank = new HashMap<>();
        for (int x : A)
            rank.putIfAbsent(x, rank.size() + 1);
        for (int i = 0; i < arr.length; ++i)
            A[i] = rank.get(arr[i]);
        return A;
    }

}
