public class q2 {
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int rem = decimal % 2;
            binary.append(rem);
            decimal /= 2;
        }
        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        int decimal = 15;
        String binary = decimalToBinary(decimal);
        System.out.println("Binary equivalent of " + decimal + " is " +
                binary);
    }
}