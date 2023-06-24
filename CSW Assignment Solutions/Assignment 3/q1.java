public class q1 {
    public static int sortZeroesOnes(int[] arr) {
        int left = 0, right = arr.length - 1;
        int swaps = 0;
        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }
            while (arr[right] == 1 && left < right) {
                right--;
            }
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                swaps++;
                left++;
                right--;
            }
        }
        return swaps;
    }

}