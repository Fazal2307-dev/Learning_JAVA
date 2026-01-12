//Write a Java program that accepts a string from the user and checks
// whether it is correct or not.
public class Problem_91 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            String input = sc.nextLine();

            // Check if the string contains only alphabets
            if (input.matches("[a-zA-Z]+")) {
                System.out.println("The string is correct (only alphabets).");
            } else {
                System.out.println("The string is incorrect (contains non-alphabet characters).");
            }
        }
    }
}
