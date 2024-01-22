package arrays;

public class LargeSmall {
    public static void main(String[] args) {
        // Program with an array
        int[] numbers = {5, 3, 8, 2, 7, 1, 9, 4, 6};
        findMinMax(numbers);
    }

    // Function to find the largest and smallest numbers in an array
    private static void findMinMax(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}
