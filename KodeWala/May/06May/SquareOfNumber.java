interface ICalc{
    public abstract int doCal(int a);
}

public class SquareOfNumber {
    public static void main(String[] args){
        ICalc cal = (i)->i*i;
        int value = cal.doCal(4);
        System.out.println("Calculate SquareOFNumber :"+value);
    }
}