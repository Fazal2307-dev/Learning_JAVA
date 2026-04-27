
abstract class PaymentSystem{ //(abstract)+(Non-abstract -Method with body)
    public abstract void pay();//what
    public abstract void Gpay();
    public void AmazonPay() {
        System.out.println("AmazonPay");
    }
    PaymentSystem(){
        super();
    }
}

class HDFC extends PaymentSystem{
    @Override
    public void pay() {
        System.out.println("HDFC.pay(....)");//how ?
    }

    @Override
    public void Gpay() {
        System.out.println("HDFC.GPay()");
    }
    HDFC(){
        super();
    }

}

public class Payment {

    public static void main(String[] args) {
        PaymentSystem p1 = new HDFC();
        p1.pay();
        p1.Gpay();
        p1.AmazonPay();

    }

}
