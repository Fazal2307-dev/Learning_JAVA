abstract class DeliveryItems{
    public abstract void delivehry();
    public abstract void expressCart();
    public void delivery() {
        System.out.println("DeliveryItems.delivery()");
    }
}


class Product extends DeliveryItems{
    @Override
    public void  delivehry() {
        System.out.println("Product.Delivehry()");
    }
    @Override
    public void expressCart() {
        System.out.println("Product.ExpressCart()");
    }
}

public class EcomDelivery {

    public static void main(String[] args) {
        DeliveryItems d1 = new Product();
        d1.delivery();
        d1.delivehry();
        d1.expressCart();

    }

}