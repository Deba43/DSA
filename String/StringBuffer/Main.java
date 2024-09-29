package String.StringBuffer;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        // constructor 2
        StringBuffer sb2 = new StringBuffer("Debadatta");

        // constructor 3
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());

        sb.append("Debadatta");
        sb.append(" Behera");
        sb.insert(0, "Mr. ");
        sb.replace(3, 13, "Tushar");
        sb.delete(10, 16);
        // sb.reverse();
        String str = sb.toString();
        System.out.println(str);

        int n = 5;
        String name = RandomString.generate(n);
        System.out.println(name);

        String sentence = "Hi Good Morning";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s", ""));

        String arr = "Debadatta, Tushar, Sachin";
        String[] names = arr.split(",");
        System.out.println(Arrays.toString(names));

        DecimalFormat df = new DecimalFormat("000.00007");
        System.out.println(df.format(77.67));
    }

}
