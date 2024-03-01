public class q12 {
    public static int maxDistance(int[] arr) {
        int n = arr.length;
        int maxDist = -1;
        int minVal = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > minVal) {
                maxDist = Math.max(maxDist, i - findFirstSmaller(arr,
                        i, arr[i]));
            } else {
                minVal = arr[i];
            }
        }
        return maxDist;
    }
    private static int findFirstSmaller(int[] arr, int end, int val) {
        int start = 0;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] < val) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 2, 6, 1 };
        System.out.println("Maximum distance: " + maxDistance(arr));
    }
}
