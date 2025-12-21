//Write a Java program to compute hexagon area.
import java.util.Scanner;
public class Problem_17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of s:");
        int s = sc.nextInt();
        double AreaofHexagon = (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
        System.out.print("Area of Hexagon:" +AreaofHexagon);
    }
}