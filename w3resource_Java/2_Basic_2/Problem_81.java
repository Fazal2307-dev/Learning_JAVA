//Write a Java program to create the maximum number of regions obtained
// by drawing n given straight lines.
import java.util.*;
public class Problem_81{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = in.nextInt();
        System.out.print("No of region:" +((n*(n+1) >> 1) +1));
    }
}