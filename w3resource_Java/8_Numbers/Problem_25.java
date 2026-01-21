//Write a Java program to print the first 15 numbers of the Pell series.
import java.util.Scanner;
public class Problem_25  {

    public static void main(String args[])
    {
        int n,a=1,b=0,c;
        System.out.println("First 20 Pell numbers: ");
        for(n=1; n<=20; n++)
        {
            c= a + 2*b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}
