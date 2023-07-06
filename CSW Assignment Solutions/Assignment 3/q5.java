import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class q5 {
    public static void main(String[] args) {
        int[] arr1 = { 3, 2, 1, 5, 4 };
        int[] arr2 = { 5, 4, 3, 2, 1 };
        sortArray(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
    }
    public static void sortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }
        Integer[] temp = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            temp[i] = arr1[i];
        }
        Arrays.sort(temp, (a, b) -> {
            int aIndex = map.getOrDefault(a, Integer.MAX_VALUE);
            int bIndex = map.getOrDefault(b, Integer.MAX_VALUE);
            return aIndex - bIndex;
        });
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = temp[i];
        }
    }
}
