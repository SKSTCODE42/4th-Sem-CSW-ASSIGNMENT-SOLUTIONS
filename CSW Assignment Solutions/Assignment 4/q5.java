import java.util.*;

public class q5 {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 1, 9, 2, 6, 8, 11 };
        int n = arr.length;
        int max = arr[0], min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
        Set<Integer> set = new HashSet<>();
        for (int i = min; i <= max; i++) {
            set.add(i);
        }
        for (int i = 0; i < n; i++) {
            set.remove(arr[i]);
        }
        System.out.print("Values in range minimum and maximum that are absent in the array: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
