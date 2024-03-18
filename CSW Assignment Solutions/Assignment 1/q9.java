public class q9 {
    public static int findSmallesPositiveMissing(int[] arr) {
        int n = arr.length;
        boolean[] present = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                present[arr[i]] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return n + 1;
    }
    public static void main(String[] args) {
        int[] arr = { 3, 1, -1, 4, 2, 5, 7 };
        int smallest = findSmallesPositiveMissing(arr);
        System.out.println("Smallest positive missing number: " +
                smallest);
    }
}
