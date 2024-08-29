package Searching;

public class CandySwap {

    public static void main(String[] args) {
        CandySwap cs = new CandySwap();

        int[] A1 = { 1, 1 };
        int[] B1 = { 2, 2 };
        int[] result1 = cs.fairCandySwap(A1, B1);
        System.out.println("Result for A1, B1: [" + result1[0] + ", " + result1[1] + "]");

        int[] A2 = { 1, 2 };
        int[] B2 = { 2, 3 };
        int[] result2 = cs.fairCandySwap(A2, B2);
        System.out.println("Result for A2, B2: [" + result2[0] + ", " + result2[1] + "]");

        int[] A3 = { 2 };
        int[] B3 = { 1, 3 };
        int[] result3 = cs.fairCandySwap(A3, B3);
        System.out.println("Result for A3, B3: [" + result3[0] + ", " + result3[1] + "]");

        int[] A4 = { 1, 2, 5 };
        int[] B4 = { 2, 4 };
        int[] result4 = cs.fairCandySwap(A4, B4);
        System.out.println("Result for A4, B4: [" + result4[0] + ", " + result4[1] + "]");
    }

    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0, sumB = 0;
        for (int i = 0; i < A.length; i++)
            sumA += A[i];
        for (int i = 0; i < B.length; i++)
            sumB += B[i];
        int dif = (sumA - sumB) / 2;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] - B[j] == dif)
                    return new int[] { A[i], B[j] };
            }
        }
        return null;
    }

}
