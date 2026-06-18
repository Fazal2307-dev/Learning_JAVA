import java.util.Optional;

public class Problem_18 {

    public static void main(String[] args) {
        ///find the first non repeating char
        String word = "abbac";
        Optional<Character> output=	word.chars().mapToObj(c -> (char) c).filter(ch -> word.indexOf(ch) == word.lastIndexOf(ch)).findFirst();
        System.out.println(output.get());

    }

}