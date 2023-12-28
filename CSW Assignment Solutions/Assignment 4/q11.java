import java.util.*;

public class q11 {
    public static void findPair(int[] x, int[] y, int value) {
        Set<Integer> set = new HashSet<>();
        for (int i : x) {
            set.add(i);
        }
        for (int j : y) {
            if (set.contains(value - j)) {
                System.out.println("(" + (value - j) + ", " + j + ")");
                return;
            }
        }
        System.out.println("Pair not found");
    }
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5 };
        int[] y = { 6, 7, 8, 9, 10 };
        int value = 9;
        findPair(x, y, value); // Output: (4, 5)
    }
}
