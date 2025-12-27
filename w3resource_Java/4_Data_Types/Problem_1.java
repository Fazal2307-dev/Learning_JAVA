//Write a Java program to convert temperature from
// Fahrenheit to Celsius degrees.
import java.util.Scanner;
public class Problem_1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of temperature in Fahrenheit:");
        int fahrenheit = in.nextInt();
        double celsius = ((5*(fahrenheit-32))/9);
        System.out.print("Value of celsius:"+celsius);
    }
}