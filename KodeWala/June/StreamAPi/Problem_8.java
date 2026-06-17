//Count strings starting with a specific prefix, e.g., “A”.
import java.util.List;
import java.util.*;

public class Problem_8 {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        long nameCount = names.stream().filter( n -> n.startsWith("A")).count();
        System.out.println(nameCount);

    }
}