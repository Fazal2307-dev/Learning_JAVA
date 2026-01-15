//Write a Java program that takes a year from the user and prints whether it is a leap
// year or not.
import java.util.*;
public class Problem_9{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of year:");
        int year = in.nextInt();
        if(year % 4 ==0 && year % 100 !=0){
            System.out.println("Leap year:");
        } else if( year % 400 ==0){
            System.out.println("Leap Year:");
        } else{
            System.out.println("Not Leap Year:");
        }
    }
}