//10.Write a Java program to create a base class Animal with methods eat() and sound().
// Create three subclasses: Lion, Tiger, and Panther. Override the eat() method in each
// subclass to describe what each animal eats. In addition, override the sound() method
// to make a specific sound for each animal.
class Animal{
    void eat(){
        System.out.println("Animal.eat()");
    }
    void sound(){
        System.out.println("Animal.sound()");
    }
}

class Lion extends Animal{
    @Override
    void eat(){
        System.out.println("Lion.eat(Meat)");
    }
    void sound(){
        System.out.println("Lion.sound(Roar)");
    }

}
class Tiger extends Animal{
    @Override
    void eat(){
        System.out.println("Tiger.eat(Fish and Meat)");
    }
    void sound(){
        System.out.println("Tiger.sound(Roar)");
    }

}
class Panther extends Animal{
    @Override
    void eat(){
        System.out.println("Panther.eat(Meat and vegitable)");
    }
    void sound(){
        System.out.println("Panther.sound(Roar)");
    }

}
public class Animal_Lion_Tiger_Panther {
    public static void main(String[] args){
        Animal a1 = new Lion();
        a1.eat();
        a1.sound();
        System.out.println(".................");
        Animal a2 = new Tiger();
        a2.eat();
        a2.sound();
        System.out.println(".................");
        Animal a3 = new Panther();
        a3.eat();
        a3.sound();
    }
}