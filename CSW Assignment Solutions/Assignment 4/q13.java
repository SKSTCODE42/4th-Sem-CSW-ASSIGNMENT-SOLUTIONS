import java.util.Arrays;
public class q13 {
    public static void findMinimumDifferencePair(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        int minDiff = Integer.MAX_VALUE;
        int pair1 = -1, pair2 = -1;
        while (i < arr1.length && j < arr2.length) {
            int diff = Math.abs(arr1[i] - arr2[j]);
            if (diff < minDiff) {
                minDiff = diff;
                pair1 = arr1[i];
                pair2 = arr2[j];
            }
            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println("Minimum difference pair: (" + pair1 + ", " + pair2 + ")");
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 11, 17 };
        int[] arr2 = { 9, 10, 11, 13, 14 };
        findMinimumDifferencePair(arr1, arr2);
    }
}
