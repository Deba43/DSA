package Arrays_ArrayList;

public class Max {
    public static void main(String[] args) {
        int arr[] = { 22, 7, 78, 44, 33, 18 };
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 3, 5));

    }

    public static int max(int arr[]) {

        int max = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;
    }

    public static int maxRange(int arr[], int start, int end) {
        if (start > end)
            return -1;
        if (arr == null)
            return -1;

        int max = arr[start];

        for (int i = start; i <= end; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;

    }
}
