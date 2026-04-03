class Order extends Object{
    int amount;
    Order(){
        this(2000);
    }
    Order(int _amount){
        super();
        this.amount = _amount;
    }
}


public class Driver {

    public static void main(String[] args) {
        Order ord = new Order();
        System.out.println(ord.amount);
    }

}
