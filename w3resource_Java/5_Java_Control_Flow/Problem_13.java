//Write a Java program to display the cube of the given number up to an integer.
import java.util.*;
public class Problem_13{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=in.nextInt();
        System.out.print("cube of n:"+(n*n*n));
    }
}