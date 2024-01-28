public class q3 {
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        int number = 12345;
        int reversed = reverse(number);
        System.out.println("Reverse of " + number + " is " + reversed);
    }
}
