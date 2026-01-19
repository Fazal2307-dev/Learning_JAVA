//Write a Java program to find the Excel column name that corresponds to a
// given column number (integer value).
import java.util.*;
import java.lang.Character;

public class Problem_28{
    public static String Column(int n) {
        String str_column = "";

        while (n > 0) {
            int col_val = (n - 1) % 26;
            str_column = (char)(col_val + 'A') + str_column;
            n = (n - 1) / 26;
        }

        return str_column;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = scan.nextInt();

        System.out.println("Excel Column: " + Column(n));
    }
}