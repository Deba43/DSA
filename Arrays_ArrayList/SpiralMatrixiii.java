package Arrays_ArrayList;

public class SpiralMatrixiii {
    public static int[][] spiralMatrixIII(int R, int C, int x, int y) {
        int[][] res = new int[R * C][2];
        int dx = 0, dy = 1, n = 0, tmp;
        for (int j = 0; j < R * C; ++n) {
            for (int i = 0; i < n / 2 + 1; ++i) {
                if (0 <= x && x < R && 0 <= y && y < C)
                    res[j++] = new int[] { x, y };
                x += dx;
                y += dy;
            }
            tmp = dx;
            dx = dy;
            dy = -tmp;
        }
        return res;
    }

    public static void main(String[] args) {
        int R = 5, C = 6;
        int x = 1, y = 4;

        int[][] result = spiralMatrixIII(R, C, x, y);

        System.out.println("Spiral order coordinates:");
        for (int[] coord : result) {
            System.out.println("[" + coord[0] + ", " + coord[1] + "]");
        }
    }

}
