//Write a Java program to get the character (Unicode code point) at the given
// index within the string.
public class Problem_2 {

    public static void main(String[] args) {

        String str = "w3resource.com";
        System.out.println("Original String : " + str);

        int val1 = str.codePointAt(1);

        // Retrieve the Unicode code point at index 9 in the string.
        int val2 = str.codePointAt(9);

        // Print the Unicode code point representing the character at index 1 in the string.
        System.out.println("Character(unicode point) = " + val1);
        // Print the Unicode code point representing the character at index 9 in the string.
        System.out.println("Character(unicode point) = " + val2);
    }
}