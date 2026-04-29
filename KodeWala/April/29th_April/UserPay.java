interface PaymentSystem{
    public abstract void getPay();
    default void printPassBook(){
        System.out.println("PaymentSystem.printPassBook");
    }
}
class HDFC implements PaymentSystem{
    @Override
    public void getPay(){
        System.out.println("HDFC.getPay()");
    }
}
class SBI implements PaymentSystem{
    @Override
    public void getPay(){
        System.out.println("SBI.getPay()");
    }
    @Override
   public  void printPassBook(){
        System.out.println("PaymentSystem.printPassBook");
    }

}
public class UserPay{
    public static void main(String[] args){
        PaymentSystem h1 = new HDFC();
        h1.getPay();
        PaymentSystem s1 = new SBI();
        s1.getPay();
        s1.printPassBook();
    }
}