package Arrays_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray {

    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 3, 4 };
        int index[] = { 0, 1, 2, 1, 1 };

        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            l.add(index[i], nums[i]);

        int target[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++)

            target[i] = l.get(i);

        System.out.println(Arrays.toString(target));
    }

}
