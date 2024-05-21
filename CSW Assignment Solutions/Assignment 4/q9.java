import java.util.Arrays;
public class q9 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, -7, 8, -2, 10, -4 };
        int n = arr.length;
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        int minSum = Integer.MAX_VALUE, x = 0, y = 0;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                x = arr[left];
                y = arr[right];
            }
            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("The two elements with sum closest to zero are: " + x + " and " + y);
    }
}
