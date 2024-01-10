import java.util.Arrays;

public class q12 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 9, 15, 19 };
        int[] minDiffPair = findMinDifferencePair(arr);
        System.out.println("Minimum difference pair: " + Arrays.toString(minDiffPair));
    }
    public static int[] findMinDifferencePair(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            throw new IllegalArgumentException("Array should have at least two elements");
        }
        Arrays.sort(arr); // Sort the array
        int minDiff = Integer.MAX_VALUE;
        int[] minDiffPair = new int[2];
        for (int i = 1; i < n; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
                minDiffPair[0] = arr[i - 1];
                minDiffPair[1] = arr[i];
            }
        }
        return minDiffPair;
    }
}
