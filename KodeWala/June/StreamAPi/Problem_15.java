import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Problem_15 {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5);
//		num.stream().sorted((a,b)-> b-a).skip(4).forEach(i -> System.out.println(i));
        //min
        //max
        Optional<Integer> op1 = num.stream().min((a,b) -> a-b);
        Optional<Integer> op2 = num.stream().max((a,b) -> a-b);
        System.out.println("Min value from List :"+ op1.get());
        System.out.println("Max value from List :"+ op2.get());

    }

}