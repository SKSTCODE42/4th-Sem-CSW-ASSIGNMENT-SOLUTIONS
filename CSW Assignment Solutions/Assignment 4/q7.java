public class q7 {
    public static void findOddOccurrence(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        int rightmostSetBit = xor & -xor;
        int num1 = 0, num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & rightmostSetBit) == 0) {
                num1 ^= arr[i];
            } else {
                num2 ^= arr[i];
            }
        }
       System.out.println("The two elements that appear odd number of times are: " + num1 + " and " + num2);
    }
}
