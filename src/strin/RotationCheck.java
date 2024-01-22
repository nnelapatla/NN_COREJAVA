package strin;

public class RotationCheck {
        public static void main(String[] args) {
            // Provide the two strings directly
            String str1 = "JavaJ2eeStrutsHibernate";
            String str2 = "StrutsHibernateJavaJ2ee";

            // Call the isRotation method and display the result
            boolean result = isRotation(str1, str2);

            // Display the result
            if (result) {
                System.out.println(str2 + " is a rotation of " + str1);
            } else {
                System.out.println(str2 + " is not a rotation of " + str1);
            }
        }

        // Method to check if one string is a rotation of another string
        private static boolean isRotation(String s1, String s2) {
            // Check if lengths are equal and both strings are not empty
            if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty()) {
                return false;
            }

            // Concatenate the first string with itself
            String concatenatedString = s1 + s1;

            // Check if the second string is a substring of the concatenated string
            return concatenatedString.contains(s2);
        }
    }

