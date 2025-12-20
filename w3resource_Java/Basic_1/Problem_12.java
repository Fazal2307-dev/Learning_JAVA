//Write a Java program to swap two variables.
import java.util.Scanner;
public class Problem_12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vaalue of a and b:");
        int a = sc.nextInt(),b=sc.nextInt();
        int temp;
        temp =a;
        a=b;
        b= temp;
        System.out.print("After Swap a and b:"+a+" "+b);
    }
}