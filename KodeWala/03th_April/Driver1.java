class Base {
    int baseValue;
    Base(int val) {
        this.baseValue = val;
        System.out.println("Base constructor called with: " + val);
    }
}

// Child class extending Base
class Order extends Base {
    int amount;
    Order() {
        this(2000);
    }
    Order(int _amount) {
        super(100);   // ✅ now valid, because Base(int) exists
        this.amount = _amount;
        System.out.println("Order constructor called with: " + _amount);
    }
}

public class Driver1 {
    public static void main(String[] args) {
        Order ord = new Order();
    }
}
