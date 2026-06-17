//Calculate the sum of all numbers in a list.
import java.util.*;
import java.util.List;
public class Problem_7 {
    public static void main(String[] args){
    List<Integer> nums = Arrays.asList(4,8,79,23,45,65);
     List<Integer> output =   nums.stream().mapToInt((a,b)  -> a+b).sum();
     System.out.println("Output " + output);
    }
}