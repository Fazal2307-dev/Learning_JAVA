import java.util.Arrays;
import java.util.List;

public class Problem_14 {

    public static void main(String[] args) {
        //sum();
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int sum = num.stream().reduce(0,(a,b)-> a+b);
        System.out.println(sum);

    }

}
