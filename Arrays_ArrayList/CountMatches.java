package Arrays_ArrayList;

import java.util.Arrays;
import java.util.List;

public class CountMatches {

    public static void main(String[] args) {

        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";

        CountMatches cm = new CountMatches();

        int result = cm.countMatches(items, ruleKey, ruleValue);

        System.out.println("Number of matches: " + result);
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;

        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue))
                res++;
            if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue))
                res++;
            if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue))
                res++;
        }

        return res;
    }
}
