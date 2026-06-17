//Concatenate all strings in a list into a single string.
import java.util.*;
import java.util.List;
public class Problem_11 {
    public static void main(String[] args){
        List<String> words = Arrays.asList("Stream", "API", "is", "powerful");
        String concatenated = words.stream()
                .reduce("", (s1, s2) -> s1 + " " + s2).trim();
        System.out.println(concatenated);
    }
}