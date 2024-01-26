import java.util.Arrays;
public class q8 {
    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 7, 9, 11 };
        int[] arr2 = { 1, 3, 4, 6, 8 };
        int n = arr1.length;
        for (int i = n - 1, j = n / 2 - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr1[j] > arr2[i - n / 2]) {
                int temp = arr1[j];
                arr1[j] = arr2[i - n / 2];
                arr2[i - n / 2] = temp;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
