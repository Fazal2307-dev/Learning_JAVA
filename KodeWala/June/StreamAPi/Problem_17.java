import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem_17 {
    //partining the data

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banglore","Pune","Chennai","Hyderabad","Delhi","Noida","Mysore","Patna");
        Map<Boolean, List<String>> output =		list.stream().collect(Collectors.partitioningBy(w -> w.length()>6));
        System.out.println(output);
    }

}
