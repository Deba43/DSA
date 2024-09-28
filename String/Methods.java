package String;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        String name = "Debadatta Hello World";
        System.out.println(name);
        System.out.println(name.toCharArray());
        System.out.println(name.toString());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf('a'));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.contains("Hello"));
        System.out.println(name.substring(2));
        System.out.println(name.substring(2, 9));
        System.out.println(name.replace('a', 'o'));
        System.out.println(" Debadatta ".trim());
        System.out.println(" Debadatta ".strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }

}
