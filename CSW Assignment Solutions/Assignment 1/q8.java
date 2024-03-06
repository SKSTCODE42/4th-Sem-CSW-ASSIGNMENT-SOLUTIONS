import java.util.Arrays;

public class q8 {
    public static void arrange(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i] != i && arr[i] != -1) {
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 2, 1, 4, 0, 5, 3 };
        System.out.println("Original array: " + Arrays.toString(arr));
        arrange(arr);
        System.out.println("Arranged array: " + Arrays.toString(arr));
    }
}
