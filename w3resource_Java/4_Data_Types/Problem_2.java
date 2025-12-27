//Write a Java program that reads a number in inches and converts it to meters.
import java.util.Scanner;
public class Problem_2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of inches:");
        int inches = in.nextInt();
        double meters = inches*0.0254;
        System.out.print("Value of meter:"+meters);
    }
}