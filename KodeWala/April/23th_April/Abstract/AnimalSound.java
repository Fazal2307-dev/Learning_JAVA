//rite a Java program to create an abstract class Animal with an abstract method called
// sound(). Create subclasses Lion and Tiger that extend the Animal class and implement
// the sound() method to make a specific sound for each animal.
abstract class Animal{
public void sound(){
    System.out.println("Animal Sound");
   }
}
class Lion extends Animal{
    @Override
   public  void sound(){
        System.out.println("Lion Sound");
    }
}
class Tiger extends Animal{
    @Override
   public  void sound(){
        System.out.println("Tiger Sound");
    }
}

public class AnimalSound{
    public static void main(String[] args){
        Animal lion = new Lion() ;
        lion.sound();
        Animal tiger = new Tiger() ;
        tiger.sound();
    }
}