//Write a Java program to find the number of values in a given range divisible by a given value.
import java.util.Scanner;
public class Problem_23{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of p:");
        int p =in.nextInt();
        for(int i =5;i<=20;i++){
            if(i%p==0){
                System.out.print("Value divisible by i:"+i+",");
            }
            System.out.println();
        }
    }
}