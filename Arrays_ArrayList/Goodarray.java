package Arrays_ArrayList;

public class Goodarray {
    public boolean isGoodArray(int[] array) {
        int x = array[0], y;
        for (int a : array) {
            while (a > 0) {
                y = x % a;
                x = a;
                a = y;
            }
        }
        return x == 1;
    }

    public static void main(String[] args) {
        Goodarray ga = new Goodarray();
        int[] array = { 12, 6, 7, 23 }; // Example array
        boolean result = ga.isGoodArray(array);
        System.out.println("Is good array: " + result);
    }

}
