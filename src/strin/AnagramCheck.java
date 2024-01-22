package strin;
public class AnagramCheck {
    public static void main(String[] args) {
        // Provide the two strings directly
        String str1 = "ate";
        String str2 = "eat";

        // Call the isAnagram method and display the result
        boolean result = isAnagram(str1, str2);

        // Display the result
        if (result) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    // Method to check if two strings are anagrams
    private static boolean isAnagram(String s1, String s2) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert the strings to char arrays
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        // Sort the char arrays
        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return java.util.Arrays.equals(charArray1, charArray2);
    }
}

