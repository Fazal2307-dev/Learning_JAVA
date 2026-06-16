//Sort a list of integers in descending order.
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
public class Problem_6 {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(2,8,9,1,6,1,3,7,3);
        List<Integer> output = nums.stream().distinct().sorted((a, b) -> a-b).collect(Collectors.toList());
        System.out.println(output);
    }
}