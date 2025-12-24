//Write a Java method to compute the average of three numbers.
import java.util.Scanner;
public class Problem_2{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a =in.nextInt();
        System.out.print("Enter value of b:");
        int b =in.nextInt();
        System.out.print("Enter value of c:");
        int c =in.nextInt();
        double average = (a+b+c)/3;
        System.out.print("Vaalue of average:"+average);
    }
}