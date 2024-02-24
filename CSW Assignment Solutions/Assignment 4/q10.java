import java.util.Arrays;

public class q10 {
    public static void findSum(int[] arr, int value) {
        int n = arr.length;
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == value) {
                System.out.println("Elements with sum " + value + ": " + arr[left] + " and " + arr[right]);
                return;
            } else if (sum < value) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No elements found with sum " + value);
    }
    public static void main(String[] args) {
        int[] arr = { 4, 2, 5, 7, 8, 1 };
        int value = 9;
        findSum(arr, value);
    }
}
