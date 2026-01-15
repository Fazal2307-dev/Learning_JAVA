//Write a Java program that displays the sum of n odd natural numbers.
import java.util.*;
public class Problem_15{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=in.nextInt();
        int sum =0;
        for(int i =1;i<=n;i++){
            if( i %2 !=0){
                sum +=i;
            }
        }
        System.out.println("sum of n:"+sum);
    }
}