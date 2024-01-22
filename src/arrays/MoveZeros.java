package arrays;

public class MoveZeros {
    public static void main(String[] args) {
        // Test the program with an array
        int[] numbers = {0, 3, 0, 8, 0, 2, 7, 0, 1, 9, 4, 0, 6};
        MoveZeros(numbers);

        // Print the modified array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Function to move all 0's to the end of the array
    private static void MoveZeros(int[] arr) {
        int nonZeroIndex = 0;

        // Iterate through the array and move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        // Fill the remaining elements with 0
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }

}
