//Write a Java program to find duplicate values in an array of string values.
public class Problem_13 {
    // The main method where the program execution starts.
    public static void main(String[] args) {
        // Declare and initialize a string array 'my_array'.
        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

        // Iterate through the elements of the string array.
        for (int i = 0; i < my_array.length-1; i++) {
            for (int j = i+1; j < my_array.length; j++) {
                // Check if two string elements are equal and not the same element.
                if ((my_array[i].equals(my_array[j])) && (i != j)) {
                    // If a duplicate is found, print the duplicate element.
                    System.out.println("Duplicate Element is : " + my_array[j]);
                }
            }
        }
    }
}
