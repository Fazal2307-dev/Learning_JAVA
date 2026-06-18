import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem_16 {

    public static void main(String[] args) {
        //Length wise sort
        List<String> list = Arrays.asList("Banglore","Pune","Chennai","Hyderabad","Delhi","Noida","Mysore","Patna");
        Map<Integer, List<String>> output1 = list.stream().collect(Collectors.groupingBy(w -> w.length()));
        //group the cities by the length whose length is more than 6
        Map<Integer, List<String>> output2 = list.stream().filter(w -> w.length() > 6).collect(Collectors.groupingBy(w -> w.length()));
        System.out.println(output1);
        System.out.println(output2);



    }

}