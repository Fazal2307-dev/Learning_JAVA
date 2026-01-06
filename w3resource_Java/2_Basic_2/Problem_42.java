//Write a Java program that accepts an integer and sums the elements
// from all possible subsets of a set formed by the first n natural
// numbers.
import java.util.Scanner;
public class Problem_42{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter value of n:");
        int n = in.nextInt();
        int result = (n *(n-1) /2) * (1 << (n-1));
        System.out.print("sum of subset of n:" + result);
    }
}