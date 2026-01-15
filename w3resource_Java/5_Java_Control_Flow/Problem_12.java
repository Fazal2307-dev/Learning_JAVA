//Write a program in Java to input 5 numbers from the keyboard and find their
// sum and average.
import java.util.*;
public class Problem_12{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum =0;
        for(int i =1;i<=5;i++){
            System.out.println(i);
            sum+=i;
        }
        System.out.println("sum of num:"+sum);
        double avg = sum/5;
        System.out.println("Avg of n:"+avg);
    }
}