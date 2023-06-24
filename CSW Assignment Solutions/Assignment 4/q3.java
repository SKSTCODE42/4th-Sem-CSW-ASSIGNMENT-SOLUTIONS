import java.util.*;

public class q3 {
    public static void main(String[] args) {
        List<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 4, 2, 5));
        Set<Integer> setWithoutDuplicates = new HashSet<>();
        for (Integer element : listWithDuplicates) {
            setWithoutDuplicates.add(element);
        }
        List<Integer> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);
        System.out.println("List with duplicates: " + listWithDuplicates);
        System.out.println("List without duplicates: " + listWithoutDuplicates);
    }
}