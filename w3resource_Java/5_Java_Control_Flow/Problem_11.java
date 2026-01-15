//Write a Java program to display n terms of natural numbers and their sum.
import java.util.*;
public class Problem_11{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = in.nextInt();
        int sum =0;
        for(int i =1;i<=n;i++){
            System.out.println(i);
            sum+=i;
        }
        System.out.println("Sum of n:"+sum);
    }
}