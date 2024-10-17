package String;

public class Robot {
    public static void main(String[] args) {
        // String moves = "UD";
        String moves = "LUDR";
        boolean re = judgeCircle(moves);
        System.out.println(re);

    }

    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'U')
                x++;
            else if (ch == 'D')
                x--;
            else if (ch == 'R')
                y++;
            else if (ch == 'L')
                y--;
        }
        return x == 0 && y == 0;
    }

}
