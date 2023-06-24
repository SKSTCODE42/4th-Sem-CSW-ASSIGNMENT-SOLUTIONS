import java.util.Arrays;

public class q18 {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 9, 3, 7, 2, 8, 4, 6 };
        int n = arr.length;
        Arrays.sort(arr);
        int middleIndex = n / 2;
        System.out.println("Element at index n/2: " + arr[middleIndex]);
    }
}