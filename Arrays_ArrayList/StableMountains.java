package Arrays_ArrayList;

import java.util.ArrayList;
import java.util.List;

class StableMountains {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> sm = new ArrayList<>();
        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                sm.add(i);
            }
        }
        return sm;

    }
}
