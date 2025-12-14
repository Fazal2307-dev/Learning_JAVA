//Leap Year check
import java.util.Scanner;
public class Problem_8{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        if(n%400==0)
            System.out.println("Leap Year");
        else if(n%4==0 && n%100 !=0)
            System.out.println("Leap Year");
        else System.out.println("NOT Leap Year");

    }
}