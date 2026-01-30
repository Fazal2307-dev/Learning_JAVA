//Write a Java program to count the number of triples (characters appearing three times
// in a row) in a given string.
public class Problem_86 {

    // Method to count the number of triples in the given string
    public int noOfTriples(String stng) {
        int l = stng.length(); // Get the length of the given string
        int ctr = 0; // Initialize a counter for triples

        // Loop through the string to check for triples
        for (int i = 0; i < l - 2; i++) {
            char tmp = stng.charAt(i); // Get the character at index 'i'

            // Check if the character at index 'i' is the same as the next two characters
            if (tmp == stng.charAt(i + 1) && tmp == stng.charAt(i + 2)) {
                ctr++; // Increment the counter if a triple is found
            }
        }
        return ctr; // Return the total count of triples
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Problem_86 m = new Problem_86(); // Create an instance of the Main class

        String str1 = "welllcommmmeee"; // Given input string

        // Display the given string and the number of triples in it
        System.out.println("The given string is: " + str1);
        System.out.println("The number of triples in the string is: " + m.noOfTriples(str1));
    }
}