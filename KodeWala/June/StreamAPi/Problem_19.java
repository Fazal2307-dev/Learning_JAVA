import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Problem_19 {

    public static void main(String[] args) {
        //Concat to list
        List<Integer> num1 = Arrays.asList(1,78,98,23,56);
        List<Integer> num2 = Arrays.asList(12,708,908,233,567);
		Stream.concat(num1.stream(), num2.stream()).distinct().forEach(i -> System.out.println(i));
        Stream.concat(num1.stream(), num2.stream()).distinct().forEach(i -> System.out.println(i));



    }

}
