//Write a Java program to get a number from the user and print whether
// it is positive or negative.
import java.util.*;
public class Problem_1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your value of n:");
        int n = in.nextInt();
        if(n>=0)
            System.out.print("N is porsitive:");
        else
            System.out.print("N is negative:");
    }
}
