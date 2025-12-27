//Write a Java program to calculate the modules of two
// numbers without using any inbuilt modulus operator.
import java.util.Scanner;
public class Problem_25{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a = in.nextInt();
        System.out.print("Enter value of b:");
        int b = in.nextInt();
        int divide = a/b;
        int result = a-(divide*b);
        System.out.print("value of result:"+result);
    }
}