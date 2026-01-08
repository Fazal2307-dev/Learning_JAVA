//Write a Java program which solve the equation:
//ax+by=c
//dx+ey=f
//Print the values of x, y where a, b, c, d, e and f are given.
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Problem_61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting the user to input the values of a, b, c, d, e, f
        System.out.println("Input the values of a, b, c, d, e, f:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        // Determinant
        int det = a * e - b * d;

        if (det == 0) {
            System.out.println("No unique solution (determinant = 0).");
        } else {
            // Using Cramer's Rule
            double x = (double)(c * e - b * f) / det;
            double y = (double)(a * f - c * d) / det;

            // Rounding to 3 decimal places
            BigDecimal ansx = new BigDecimal(x).setScale(3, RoundingMode.HALF_UP);
            BigDecimal ansy = new BigDecimal(y).setScale(3, RoundingMode.HALF_UP);

            System.out.println("Solution:");
            System.out.println("x = " + ansx + ", y = " + ansy);
        }
    }
}
