import java.util.Arrays;

public class q15 {
    public static void findTriplet(int[] arr, int sum) {
        Arrays.sort(arr); // Sort the array in ascending order
        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1; // Initialize the second pointer
            int k = arr.length - 1; // Initialize the third pointer
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] == sum) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                    return;
                } else if (arr[i] + arr[j] + arr[k] < sum) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        System.out.println("No triplet found.");
    }
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 6, 3, 5, 8, 7 };
        int sum = 12;
        findTriplet(arr, sum);
    }
}
