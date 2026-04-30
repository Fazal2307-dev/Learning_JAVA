interface ProductItem{
    void delivery();
    void productDetails();
    void productValidity();
    public static void itemName(){
        System.out.println("ProductItem");
    }
}
class shirt implements ProductItem{
    @Override
    public void delivery(){
        System.out.println("shirt.delivery()");
    }
    @Override
    public void productDetails(){
        System.out.println("shirt.productDetails()");
    }
    @Override
    public void productValidity(){
        System.out.println("shirt.productValidity()");
    }
}
class Jeans implements ProductItem{
    @Override
    public void delivery(){
        System.out.println("shirt.delivery()");
    }
    @Override
    public void productDetails(){
        System.out.println("shirt.productDetails()");
    }
    @Override
    public void productValidity(){
        System.out.println("shirt.productValidity()");
        ProductItem.itemName();
    }
}
public class Delivery {
    public static void main(String args[]){
        ProductItem s1 = new shirt();
        s1.delivery();
        s1.productDetails();
        s1.productValidity();
        System.out.println("................");
        ProductItem j1 = new Jeans();
        j1.delivery();
        j1.productDetails();
        j1.productValidity();
    }
}