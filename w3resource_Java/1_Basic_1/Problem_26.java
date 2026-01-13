//Write a Java program that accepts an integer (n) and computes the
// value of n+nn+nnn.
import java.util.*;
public class Problem_26{
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter value 0f n:");
    int n = in.nextInt();
    System.out.println("Value of n+nn+nnn:"+(n+n*n+n*n*n));
}
}