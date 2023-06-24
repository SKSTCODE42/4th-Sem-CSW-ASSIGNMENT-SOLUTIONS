import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q1 {
    public static Integer findFirstRepeatedElement(List<Integer> elements) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer element : elements) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
            if (countMap.get(element) > 1) {
                return element;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Integer> elements = List.of(2, 1, 5, 3, 4, 1, 6);
        Integer firstRepeated = findFirstRepeatedElement(elements);
        System.out.println(firstRepeated); // prints 1
    }
}