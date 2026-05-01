interface PaymentGateway{
    default void validateTransaction(){
        log("Validating transaction.......");
        System.out.println("Transaction validated!");
    }
    static void checkServiceStatus(){
        log("Payment service is active.");
    }
    private static void log(String message){
        System.out.println("[log] "+message);
    }
    void processPayment(double amount);
}
class CreditCardPayment implements PaymentGateway{
    @java.lang.Override
    public void processPayment(double amount) {
        System.out.println("Paid r" + amount + " via Credit Card.");
    }
}
class UPIPayment implements PaymentGateway{
    @java.lang.Override
    public void processPayment(double amount) {
        System.out.println("Paid r" + amount + " via UPI.");
    }
}
public class PaymentApp {
    public static void main(String[] args){
        PaymentGateway.checkServiceStatus();
        PaymentGateway cc = new CreditCardPayment();
        cc.processPayment(5000);
        cc.validateTransaction();

        PaymentGateway upi = new UPIPayment();
        upi.validateTransaction();
        upi.processPayment(1500);
    }
}