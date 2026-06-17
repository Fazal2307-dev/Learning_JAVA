//Check if Any String Matches a Condition
import java.util.*;
import java.util.List;
public class Problem_10 {
    public static void main(String[] args){
        List<String> strings = Arrays.asList("Java", "Stream API", "Lambda");
        boolean containsAPI = strings.stream()
                .anyMatch(s -> s.contains("API"));
        System.out.println(containsAPI);
    }
}