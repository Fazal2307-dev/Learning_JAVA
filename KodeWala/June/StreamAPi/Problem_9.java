//sum of all integer in list
import java.util.*;
import java.util.List;
public class Problem_9 {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(4,5,78,98,56,36,45);
     int sum =    nums.stream().reduce(0,(a, b) -> a+b);
        System.out.println("Sum of Integer from list "+ sum);
    }
}