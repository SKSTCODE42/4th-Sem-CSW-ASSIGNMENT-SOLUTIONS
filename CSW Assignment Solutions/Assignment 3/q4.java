public class q4 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 6, 8, 7 };
        int k = 4;
        int count = minimumSwaps(arr, k);
        System.out.println("Minimum swaps required: " + count);
    }
    public static int minimumSwaps(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        int targetCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                targetCount++;
            }
        }
        int windowCount = 0;
        for (int i = 0; i < targetCount; i++) {
            if (arr[i] <= k) {
                windowCount++;
            }
        }
        int left = 0;
        int right = targetCount - 1;
        count = targetCount - windowCount;
        while (right < n - 1) {
            right++;
            if (arr[right] <= k) {
                windowCount++;
            }
            if (arr[left] <= k) {
                windowCount--;
            }
            left++;
            count = Math.min(count, targetCount - windowCount);
        }
        return count;
    }
}
