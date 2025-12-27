//Write a Java program to compare two numbers.
import java.util.Scanner;
public class Problem_15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a and b:");
        int a =sc.nextInt(),b=sc.nextInt();
        if(a>b){
            System.out.println("A is greater than B");
        }else{
            System.out.println("B is greater than A");
        }
    }
}