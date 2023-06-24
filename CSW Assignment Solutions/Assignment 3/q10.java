import java.util.*;

public class q10 {
    private List<Integer> integerList;

    /**
     * @param integerList
     */
    public void q10(final List<Integer> integerList) {
        this.integerList = integerList;
    }

    public int findMin() {
        return Collections.min(integerList);
    }

    public int findMax() {
        return Collections.max(integerList);
    }

    public double findMedian() {
        Collections.sort(integerList);
        int size = integerList.size();
        if (size % 2 == 0) {
            int midIndex = size / 2;
            return (integerList.get(midIndex - 1) + integerList.get(midIndex))
                    / 2.0;
        } else {
            int midIndex = size / 2;
            return integerList.get(midIndex);
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(3);
        integerList.add(7);
        integerList.add(2);
        integerList.add(9);
        q10 sortIntegerList = new q10 ();
        System.out.println("Minimum value: " + sortIntegerList.findMin());
        System.out.println("Maximum value: " + sortIntegerList.findMax());
        System.out.println("Median value: " +
                sortIntegerList.findMedian());
    }
}