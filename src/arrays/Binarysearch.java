package arrays;

public class Binarysearch {
    public static void main(String[] args) {
        // Test the program with a sorted array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        // Search for the target in the array
        int result = binarySearch(numbers, target);

        // Print the result
        if (result != -1) {
            System.out.println(target + " found at index " + result);
        } else {
            System.out.println(target + " not found in the array");
        }
    }

    // Function to perform Binary Search on a sorted array
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at the middle
            if (arr[mid] == target) {
                return mid;
            }

            // If the target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            }

            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Target not found in the array
        return -1;
    }
}
