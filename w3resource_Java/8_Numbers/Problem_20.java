//Write a Java program to display the first 10 Fermat numbers.
import java.util.Scanner;
public class Problem_20 {

    public static void main( String args[] ){
        int n = 0;
        double result;

        while (n <= 10) {
            result= Math.pow (2, Math.pow(2, n)) + 1;
            n++;
            System.out.println (result);
        }
    }
}