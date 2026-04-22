class Payment{
    void doPayment(){
        System.out.println("Payment.doPayment");
    }
}
class Gpay extends Payment{
    @Override
    void doPayment(){
        System.out.println("Gpay.doPayment");
    }
}
class AmazonPay extends Payment{
    @Override
    void doPayment(){
        System.out.println("AmazonPay.doPayment");
    }
}
class PaymentProcessor {
    void processPayment(Payment payment) {
        payment.doPayment();
    }
}
public class UPIPayment {
    public static void main(String args[]){
        Payment payment = new AmazonPay();
        payment.doPayment();
    }
}