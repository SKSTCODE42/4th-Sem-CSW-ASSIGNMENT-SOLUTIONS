public class q11 {
    public static int maxSum(int[] arr) {
        int n = arr.length;
        int maxSum = 0;
        int currSum = 0;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            currSum += i * arr[i];
        }
        maxSum = currSum;
        for (int i = 1; i < n; i++) {
            currSum = currSum + totalSum - n * arr[n - 1];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 8, 2, 7 };
        System.out.println("Maximum sum: " + maxSum(arr));
    }
}
