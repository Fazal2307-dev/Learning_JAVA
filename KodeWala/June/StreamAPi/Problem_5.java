// find highest element from list
import java.util.*;
import java.util.List;
public class Problem_5 {
    public static void main(String[] args) {
        List<Integer> salary = Arrays.asList(1, 7, 8, 56, 47, 98, 25, 9874, 2365);
        Optional<Integer> op1 = salary.stream().distinct().sorted((a, b) -> b - a).skip(0).findFirst();
        System.out.println(op1.get());
    }
}