package Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayFrequency {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2, 2, 3 };
        System.out.println(Arrays.toString(frequencySort(nums)));

    }

    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.stream(nums).forEach(n -> map.put(n, map.getOrDefault(n, 0) + 1));

        return Arrays.stream(nums).boxed()
                .sorted((a, b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a)
                .mapToInt(n -> n)
                .toArray();
    }

}
