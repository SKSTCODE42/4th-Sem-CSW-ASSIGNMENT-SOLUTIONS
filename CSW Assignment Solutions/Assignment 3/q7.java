import java.util.Arrays;
public class q7 {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 8, 3, 2 };
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > count) {
                count++;
                arr[i] = 0;
            }
        }
        System.out.println("Number of elements left after each reduction ");
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                System.out.print(n - i + " ");
            }
        }
    }
}
