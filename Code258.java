public class Code258 {
    public static void main(String[] args) {
        int num = 38;
        while (Integer.toString(num).length() != 1) {
            int sumDigit = 0;
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sumDigit += digit;
                temp /= 10;
                // System.out.println(digit);
            }
            num = sumDigit;
        }
        System.out.println(num);
    }
}
