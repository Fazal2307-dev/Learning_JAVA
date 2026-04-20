class Fruit{
    String name = "Fruit";
}
class Apple extends Fruit{
    String name = "Apple";
}
class shop{
    Fruit getItem(){
        System.out.println("Giving Fruit");
        return new Fruit();
    }
}
class AppleShop extends shop{
    Apple getItem(){
        System.out.println("Giving Apple");
        return new Apple();
    }
}
public class CovariantFruitExp {
    public static void main(String[] args) {
        shop shop  = new AppleShop();
        Fruit f = shop.getItem();
        System.out.println(f.name);
    }
}