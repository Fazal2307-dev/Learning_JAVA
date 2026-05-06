interface ChangeString{
    public abstract String changeToUpperCase(String name);
}
public class ChangeToUpperCase {
    public static void main(String[] args){
        ChangeString string = (name) -> name.toUpperCase();
        String changedValue = string.changeToUpperCase("fazal");
        System.out.println(changedValue);
    }
}