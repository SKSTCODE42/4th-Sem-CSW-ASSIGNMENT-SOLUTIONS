import java.util.Arrays;
public class q14 {
    public static void findTriplet(int[] arr) {
        Arrays.sort(arr); // Sort the array to use two pointer approach
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1, target = -arr[i];
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) {
                    System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
                    return; // return after finding the first triplet
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println("No triplet found with sum 0.");
    }
}
