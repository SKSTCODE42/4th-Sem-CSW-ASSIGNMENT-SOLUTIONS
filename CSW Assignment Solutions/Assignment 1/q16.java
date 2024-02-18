public class q16 {
    public static int binarySearch(int[] arr, int low, int high, int x) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] < x) {
            return binarySearch(arr, mid + 1, high, x);
        } else {
            return binarySearch(arr, low, mid - 1, x);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int x = 23;
        int index = binarySearch(arr, 0, arr.length - 1, x);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}
