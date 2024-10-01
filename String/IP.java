package String;

public class IP {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String re = defangIPaddr(address);
        System.out.println(re);

    }

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

}
