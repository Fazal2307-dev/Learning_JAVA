package pos.File2;
import pos.File1.Result;
public class Marks{
    public static void main(String[] args){
        Result result = new Result();
        String userInputStr = args[0];
        int userInputInt = Integer.parseInt(userInputStr);
         result.CheckResult(userInputInt);

    }
}