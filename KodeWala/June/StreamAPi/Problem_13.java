////find the 3rd highest even number from given from list
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Problem_13 {

    public static void main(String[] args) {
        //find the 3rd highest even number from given from list
        List<Integer> nums = Arrays.asList(1,8,7,9,6,3,78,96,23,47);
        Optional<Integer> op= nums.stream().filter(e -> e %2 ==0).sorted((a,b) -> b-a).distinct().skip(2).findFirst();
        System.out.println(op.get());

    }

}
