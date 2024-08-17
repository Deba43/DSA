package Arrays_ArrayList;

public class SortColors {
    public static void sortColors(int[] A) {
        if (A == null || A.length < 2)
            return;
        int low = 0;
        int high = A.length - 1;
        for (int i = low; i <= high;) {
            if (A[i] == 0) {
                int temp = A[i];
                A[i] = A[low];
                A[low] = temp;
                i++;
                low++;
            } else if (A[i] == 2) {
                int temp = A[i];
                A[i] = A[high];
                A[high] = temp;
                high--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] colors = { 2, 0, 2, 1, 1, 0 };

        System.out.println("Array before sorting:");
        for (int color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();

        sortColors(colors);

        System.out.println("Array after sorting:");
        for (int color : colors) {
            System.out.print(color + " ");
        }
    }

}
