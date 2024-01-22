package strin;

import java.util.Scanner;

public class FindVowels {

        public static void main(String[] args) {
            // Create a Scanner object to take input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a string
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            // Close the scanner to avoid resource leakage
            scanner.close();

            // Call the countVowels method and display the result
            int vowelCount = countVowels(inputString);
            System.out.println("Number of vowels: " + vowelCount);
        }

        // Method to count the number of vowels in a given string
        private static int countVowels(String str) {
            int count = 0;

            // Convert the string to lowercase to make the comparison case-insensitive
            str = str.toLowerCase();

            // Loop through each character in the string
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }

            return count;
        }
    }
