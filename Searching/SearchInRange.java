package Searching;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = { 4, 45, 33, 22, 90, 490, 777 };
        int target = 90;
        System.out.println(Search(arr, target, 2, 5));

    }

    static int Search(int arr[], int target, int start, int end) {
        if (arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;

    }
}
