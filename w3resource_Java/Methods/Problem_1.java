//Write a Java method to find the smallest number among three numbers.
import java.util.Scanner;
public class Problem_1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a = in.nextInt();
        System.out.print("Enter value of b:");
        int b = in.nextInt();
        System.out.print("Enter value of c:");
        int c = in.nextInt();
        if(a<b && a<c)
            System.out.print("a is less than all:"+a);
        else if(b<c && b<a)
            System.out.print("b is less than all:"+b);
        else
            System.out.print("c is less than all:"+c);
    }
}