//Write a Java program that accepts two double variables and
// test if both strictly between 0 and 1 and false otherwise.
import java.util.Scanner;
public class Problem_5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first value:");
        double fv1 = in.nextDouble();
        System.out.print("Enter Second value:");
        double sv2 = in.nextDouble();
        System.out.println(fv1>0 && fv1<1 && sv2>0 && sv2<1);
    }
}