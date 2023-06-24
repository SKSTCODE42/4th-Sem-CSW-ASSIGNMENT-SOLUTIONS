import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 0, 2, 0, 1, 1, 0, 2 };
        System.out.println("Original array: " + Arrays.toString(arr));
        sortZeroOneTwo(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void sortZeroOneTwo(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}