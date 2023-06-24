public class q6 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 3, 1, 3 };
        int oddElement = findOddElement(arr);
        System.out.println("The element that appears odd number of times is: " + oddElement);
    }

    public static int findOddElement(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }
}
