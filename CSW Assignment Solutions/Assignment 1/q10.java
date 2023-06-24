import java.util.Arrays;

public class q10 {
    public static void maxMin(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = arr[right];
                right--;
            } else {
                result[i] = arr[left];
                left++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Original array: " + Arrays.toString(arr));
        maxMin(arr);
        System.out.println("Max-min array: " + Arrays.toString(arr));
    }
}