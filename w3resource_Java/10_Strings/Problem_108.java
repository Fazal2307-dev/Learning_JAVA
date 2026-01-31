//Write a Java program to check whether there are two consecutive (following each
// other continuously), identical letters in a given string.
public class Problem_108 {
    public static void main(String[] args) {
        String text = "Follow"; // Define a string 'text' with the value "Follow"
        System.out.println("Original word: " + text); // Display the original word

        // Check if there are two consecutive identical letters in the string and display the result
        System.out.println("If there are two consecutive identical letters in the said string: " + test(text));

        text = "Java"; // Change the value of 'text' to "Java"
        System.out.println("Original word: " + text); // Display the original word

        // Check if there are two consecutive identical letters in the string and display the result
        System.out.println("If there are two consecutive identical letters in the said string: " + test(text));

        text = "Yellow"; // Change the value of 'text' to "Yellow"
        System.out.println("Original word: " + text); // Display the original word

        // Check if there are two consecutive identical letters in the string and display the result
        System.out.println("If there are two consecutive identical letters in the said string: " + test(text));
    }

    // Method to test if there are two consecutive identical letters in the string
    public static boolean test(String text) {
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) { // Check for consecutive identical letters
                return true; // Return true if two consecutive identical letters are found
            }
        }
        return false; // Return false if no consecutive identical letters are found
    }
}