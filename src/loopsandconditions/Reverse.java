package loopsandconditions;

public class Reverse {
    public static void main(String[] args) {
        // Input (hardcoded number)
        int number = 1234568;

        // Reverse the number
        int reversedNumber = reverseDigits(number);

        // Output
        System.out.println("Reversed number: " + reversedNumber);
    }

    // Method to reverse the digits of a number
    private static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}


