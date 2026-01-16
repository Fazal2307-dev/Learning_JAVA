//Write a Java program that accepts two floating­point numbers and checks whether they
// are the same up to two decimal places.
import java.util.Scanner;
public class Problem_30 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first floating­point number: ");
        double num1 = input.nextDouble();
        System.out.print("Input second floating­point number: ");
        double num2 = input.nextDouble();
        input.close();

        if (Math.abs(num1 - num2) <= 0.01) {
            System.out.println("These numbers are the same.");
        }
        else {
            System.out.println("These numbers are different.");
        }
    }
}