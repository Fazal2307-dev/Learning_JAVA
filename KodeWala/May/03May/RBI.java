interface PaymentGateway {

    void pay(double amount);

    default void processPayment(double amount) {
        validate();
        pay(amount);
        log("Payment done");
    }

    static void serviceStatus() {
        System.out.println("Service Active");
    }

    private void validate() {
        System.out.println("Validating payment...");
    }

    private static void log(String msg) {
        System.out.println("[LOG] " + msg);
    }
}

class GooglePay implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid using GooglePay: " + amount);
    }
}

public class RBI {
    public static void main(String[] args) {
        GooglePay g = new GooglePay();
        g.processPayment(500);

        PaymentGateway.serviceStatus();
    }
}