package Arrays_ArrayList;

import java.util.LinkedList;
import java.util.List;

public class ArrayForm {
    public static void main(String[] args) {

        int[] num = { 2, 7, 4 };
        int K = 181;
        ArrayForm af = new ArrayForm();
        List<Integer> result = af.addToArrayForm(num, K);
        System.out.println(result);
    }

    public List<Integer> addToArrayForm(int[] num, int K) {
        List<Integer> res = new LinkedList<>();
        for (int i = num.length - 1; i >= 0; --i) {
            res.add(0, (num[i] + K) % 10);
            K = (num[i] + K) / 10;
        }
        while (K > 0) {
            res.add(0, K % 10);
            K /= 10;
        }
        return res;
    }

}
