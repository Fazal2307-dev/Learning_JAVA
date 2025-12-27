//Write a Java program to calculate the sum of two integers
// and return true if the sum is equal to a third integer.
import java.util.Scanner;
public class Problem_19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a,b and c:");
        int a =sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if(a+b == c)
            System.out.print("true");
        else if(b+c ==a)
            System.out.println("true");
        else if(a+c==b)
            System.out.println("true");
        else
            System.out.println("false");
    }
}