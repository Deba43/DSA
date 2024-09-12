package Sorting;

public class DuplicateNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicate(arr));

    }

    public static int findDuplicate(int arr[]) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;
                if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                } else {
                    return arr[i];
                }

            } else {
                i++;
            }

        }
        return -1;

    }

}
