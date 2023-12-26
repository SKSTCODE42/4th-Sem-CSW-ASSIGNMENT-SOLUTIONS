import java.util.Arrays;

public class q16 {
    /**
     * @param arr
     * @return
     */
    public static int countTriangles(int[] arr) {
        int n = arr.length;
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < n - 1; j++) {
                while (k < n && arr[i] + arr[j] > arr[k]) {
                    k++;
                }
                count += k - j - 1;
            }
        }
        return count;
    }
}
