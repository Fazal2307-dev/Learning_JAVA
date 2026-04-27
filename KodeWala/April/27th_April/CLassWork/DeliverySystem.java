abstract class Delivery{
    String name ;
    String address;
    Delivery(String name,String address){
        this.name=name;
        this.address = address;
    }
  abstract void deliveryItem();
    void showDetails(){
        System.out.println("Name :"+name);
        System.out.println("Address :"+address);
    }
}
class Express extends Delivery{
    Express(String name,String address){
        super(name,address);
    }
    @Override
    void deliveryItem(){
        System.out.println("your item will deliver in 3 day: "+name+" "+address);
    }
}
class FastDelivery extends Delivery{
    FastDelivery(String name ,String address){
        super(name,address);
    }
    @Override
    void deliveryItem(){
        System.out.println("your item will deliver in 8 clock:"+name+" "+address);
    }
}
public class DeliverySystem {
    public static void main(String args[]){
        Delivery d1 = new Express("Fazal","Patna");
        d1.showDetails();
        d1.deliveryItem();

        System.out.println("............");
        Delivery d2 = new FastDelivery("Aman","Banglore");
        d2.showDetails();
        d2.deliveryItem();

    }
}