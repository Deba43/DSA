package String;

class LongPressNmae {
    public static void main(String[] args) {

        String name = "alex";
        String typed = "aaleex";

        boolean result = isLongPressedName(name, typed);

        System.out.println(result);

    }

    public static boolean isLongPressedName(String name, String typed) {
        final int nameLength = name.length();
        final int typedLength = typed.length();

        int i = 0;
        int j = 0;

        while (j < typedLength) {
            if (i < nameLength && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {

                j++;
            } else {

                return false;
            }
        }
        return i == nameLength;
    }
}
