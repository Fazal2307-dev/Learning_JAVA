import java.util.*;
import java.util.List;

public class Problem_12 {
    public static void main(String[] args){
        List<String> name = Arrays.asList("Fazal","Afzal","Development");

        String longest = name.stream()
                .reduce("", (a, b) -> a.length() > b.length() ? a : b);

        System.out.println("Longest word from List: " + longest);
    }
}
