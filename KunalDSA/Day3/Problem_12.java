//Q3. Palindrome Number
public class Problem_12 {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) return false;

        // Numbers ending with 0 are not palindromes unless the number is 0
        if (x % 10 == 0 && x != 0) return false;

        int reversedHalf = 0;
        while (x > reversedHalf) {
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x /= 10;
        }

        // For even length numbers: x == reversedHalf
        // For odd length numbers: x == reversedHalf/10 (middle digit ignored)
        return (x == reversedHalf || x == reversedHalf / 10);
    }

    // Main method for testing
    public static void main(String[] args) {
        Problem_12 sol = new Problem_12();

        int x1 = 121;
        System.out.println(sol.isPalindrome(x1)); // true

        int x2 = -121;
        System.out.println(sol.isPalindrome(x2)); // false

        int x3 = 10;
        System.out.println(sol.isPalindrome(x3)); // false

        int x4 = 0;
        System.out.println(sol.isPalindrome(x4)); // true
    }
}
