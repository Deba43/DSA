package Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformer {
    public static void main(String[] args) {
        int[] arr = { 40, 10, 20, 30 };
        int ans[] = arrayRankTransform(arr);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < temp.length; i++)
            map.putIfAbsent(temp[i], map.size() + 1);

        for (int i = 0; i < temp.length; i++)
            temp[i] = map.get(arr[i]);
        return temp;
    }

}
