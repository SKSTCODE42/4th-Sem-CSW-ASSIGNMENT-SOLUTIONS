import java.util.HashSet;
import java.util.Scanner;

public class q7 {
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            HashSet<Integer> set = new HashSet<Integer>();
            System.out.print("Enter the number of elements: ");
            int n = input.nextInt();
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                int num = input.nextInt();
                set.add(num); // Add the element to the HashSet
            }
            System.out.println("Elements with no duplicates: " + set);
        }
    }
}
