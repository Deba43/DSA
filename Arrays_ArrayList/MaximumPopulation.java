package Arrays_ArrayList;

public class MaximumPopulation {
    public static void main(String[] args) {
        MaximumPopulation mp = new MaximumPopulation();

        int[][] logs = {
                { 1950, 1961 },
                { 1960, 1971 },
                { 1970, 1981 }
        };

        int year = mp.maximumPopulation(logs);
        System.out.println("Year with maximum population: " + year);
    }

    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for (int i = 0; i < logs.length; i++) {
            for (int s = logs[i][0]; s < logs[i][1]; s++) {
                arr[s - 1950]++;
            }
        }

        int max = 0;
        for (int i = 0; i < 101; i++) {
            if (arr[i] > arr[max])
                max = i;
        }
        return max + 1950;
    }

}
