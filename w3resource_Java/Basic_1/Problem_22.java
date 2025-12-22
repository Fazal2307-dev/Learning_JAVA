//Write a Java program to convert seconds to hours, minutes and seconds.
import java.util.Scanner;
public class Problem_22{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of second:");
        int second = in.nextInt();
        int S = second %60;
        int H = second / 10;
        int M = H % 60;
        H = H/60;
        System.out.print(H +":"+M+":"+S);
    }
}