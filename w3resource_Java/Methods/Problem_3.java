//Write a Java method to count all vowels in a string.
import java.util.Scanner;
public class Problem_3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of string:");
        String str = in.nextLine();
        System.out.print("Number of vowels in string:"+count_vowels(str)+"\n");

    }
    public static int count_vowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        return count;

    }
}
