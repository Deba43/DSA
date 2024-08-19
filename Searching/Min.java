package Searching;

public class Min {
    public static void main(String[] args) {
        int arr[] = { 4, 45, 33, 22, 90, 490, 777 };
        System.out.println(minimum(arr));
    }

    static int minimum(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;

    }

}
