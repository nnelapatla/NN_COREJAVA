package loopsandconditions;

public class Pattern {
    public static void main(String[] args) {
        for (int i = 2; i <= 6; i++) {
            // Print '+' characters
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print('+');
            }

            // Print '-' characters
            for (int k = 1; k <= i; k++) {
                System.out.print('-');
            }

            // Move to the next line
            System.out.println();
        }
    }
}