package String;

import java.util.Arrays;
import java.util.List;

public class CountMatches {
    public static void main(String[] args) {

        List<List<String>> items = Arrays.asList(
                Arrays.asList("Phone", "Blue", "Vivo"),
                Arrays.asList("Phone", "Black", "Oppo"),
                Arrays.asList("Computer", "Black", "Asus"));

        String ruleKey = "Color";
        String ruleValue = "Black";

        int result = countMatches(items, ruleKey, ruleValue);
        System.out.println("Number of matches: " + result);
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int res = 0;

        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("Type") && items.get(i).get(0).equals(ruleValue))
                res++;
            if (ruleKey.equals("Color") && items.get(i).get(1).equals(ruleValue))
                res++;
            if (ruleKey.equals("Name") && items.get(i).get(2).equals(ruleValue))
                res++;
        }
        return res;

    }
}
