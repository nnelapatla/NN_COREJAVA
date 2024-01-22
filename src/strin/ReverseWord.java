package strin;

public class ReverseWord {
        public static void main(String[] args) {
            // Provide the input sentence directly
            String inputSentence = "Java J2EE Reverse Me";

            // Call the reverseWordsInSentence method and display the result
            String reversedSentence = reverseWordsInSentence(inputSentence);
            System.out.println("Original Sentence: " + inputSentence);
            System.out.println("Reversed Sentence: " + reversedSentence);
        }

        // Method to reverse each word in a sentence
        private static String reverseWordsInSentence(String sentence) {
            // Split the sentence into words
            String[] words = sentence.split("\\s");

            // Reverse each word and concatenate them
            StringBuilder reversedSentence = new StringBuilder();
            for (String word : words) {
                String reversedWord = reverseString(word);
                reversedSentence.append(reversedWord).append(" ");
            }

            // Remove the trailing space and return the result
            return reversedSentence.toString().trim();
        }

        // Method to reverse a string
        private static String reverseString(String str) {
            char[] charArray = str.toCharArray();
            int start = 0;
            int end = charArray.length - 1;

            while (start < end) {
                // Swap characters at start and end indices
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;

                // Move indices towards each other
                start++;
                end--;
            }

            return new String(charArray);
        }
    }


