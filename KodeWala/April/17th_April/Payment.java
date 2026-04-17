class Pay extends Object{
    void PaymentSystem() {
        System.out.println("Doing Payment From PaymentSystem");
    }
}
class PhonePay extends Pay {
    void PaymentSystem() {
        int phonePayAmount = 1000;
        System.out.println("Doing Payment through PhonePay after changing Pay.PaymentSystem(): "+phonePayAmount);
    }
}
class Gpay extends Pay{
    void PaymentSystem() {
        double  gPayAmount = 10000.45;
        System.out.println("Doing Payment through Gpay after changing Pay.PaymentSystem(): "+gPayAmount);
    }
}

public class Payment {

    public static void main(String[] args) {
        Gpay gpay = new Gpay();
        gpay.PaymentSystem();
        PhonePay phonepay = new PhonePay();
        phonepay.PaymentSystem();
    }
}
