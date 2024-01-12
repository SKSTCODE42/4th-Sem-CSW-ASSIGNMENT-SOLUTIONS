public class q15 {
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int gcd = findGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " +
                gcd);
    }
}
