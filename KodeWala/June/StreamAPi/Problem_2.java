import java.util.*;
import java.util.stream.Collectors;
public class Problem_2 {
    public static void main(String[] args){
        List<Integer> input = Arrays.asList(1,7,8,9,6,4,78,96,35);
        List<Integer> output = input.stream().filter(w -> w %2 ==0).map(l -> l *10).collect(Collectors.toList());
        System.out.println("OutPut " +output);
    }
}