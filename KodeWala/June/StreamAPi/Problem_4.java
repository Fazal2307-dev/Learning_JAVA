//Find the maximum number from a list of integers.
import java.util.*;
import java.util.stream.Collectors;
public class Problem_4 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(4,8,79,56,23,45,789);
        int  maxNumbers = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("MaxNumber from list :"+ maxNumbers);
    }
}