//Write a Java program that reads a number and displays the square,
// cube, and fourth power.
import java.util.Scanner;
public class Problem_5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = in.nextInt();
        System.out.println("Square of n:"+n*n);
        System.out.println("Cube of n:"+n*n*n);
        System.out.println("fourth Power of n:"+n*n*n*n);
    }
}