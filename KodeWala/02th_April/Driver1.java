class OrderMgmt {
    OrderMgmt(){
        super();
        System.out.println("OrderMgmt.OrderMgmt()");
    }
}
class Order extends OrderMgmt{
    public Order() {
        this("Kodewala");
        System.out.println("Order.Order()");
    }
    public Order(String name) {
        super();
        System.out.println("Order.Order(name)");
    }
}
public class Driver1 extends Object{

    public static void main(String[] args) {
        Order ord = new Order();
    }
}