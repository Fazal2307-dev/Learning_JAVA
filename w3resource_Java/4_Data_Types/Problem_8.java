//Write a Java program to compute the body mass index (BMI).
import java.util.Scanner;
public class Problem_8{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of weight:");
        double weight = in.nextDouble();
        System.out.print("Input height in inches: ");
        double inches = in.nextDouble();

        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");
    }
}