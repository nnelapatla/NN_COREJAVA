package loopsandconditions;

public class Fibonacci{
    public static void main(String[] args) {
        // Input
        int n = 10;

        // Output Fibonacci Series up to n
        printFibonacciSeries(n);
    }

    // Function to print Fibonacci Series up to n
    private static void printFibonacciSeries(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series up to " + n + ": ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
