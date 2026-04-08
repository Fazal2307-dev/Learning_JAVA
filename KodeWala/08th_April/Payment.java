
public class Payment {
    static {
        System.out.println("Inside SIB:");

    }
    {
        System.out.println("Inside IIB :");
    }

    public Payment() {
        //1 line -super() or this();
        //2nd call to init block
        System.out.println("inside Payment() constructr");
    }
    public Payment(int _amt) {
        System.out.println("Payment.payment(_amt)");
    }


    public static void main(String[] args) {
        System.out.println("Main method:");
        Payment payment = new Payment();
        Payment payment1 = new Payment(100);

    }


}
