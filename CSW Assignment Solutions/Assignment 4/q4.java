public class q4 {
    public static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2; // sum of all elements from 1 to n
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return totalSum - sum; // the missing element
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 3, 7, 8 };
        int missingNum = findMissing(arr);
        System.out.println("The missing element is: " + missingNum);
    }
}
