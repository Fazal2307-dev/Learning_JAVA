//7.Write a Java program to create a base class Animal with methods move() and
// makeSound(). Create two subclasses Bird and Panthera. Override the move() method in
// each subclass to describe how each animal moves. Also, override the makeSound()
// method in each subclass to make a specific sound for each animal.
class Animal{
    void move(){
        System.out.println("Animal.move()");
    }
    void makeSound(){
        System.out.println("Animal.makeSound()");
    }
}
class Bird extends Animal{
    @Override
    void move(){
        System.out.println("Bird.move()");
    }
    @Override
    void makeSound(){
        System.out.println("Bird.makeSound()");
    }
}
class Panthera extends Animal{
    @Override
    void move(){
        System.out.println("Panthera.move()");
    }
    @Override
    void makeSound(){
        System.out.println("Panthera.makeSound()");
    }
}
public class Animal_Bird_Panthera {
    public static void main(String[] args){
        Animal a1 = new Bird();
        a1.move();
        a1.makeSound();
        System.out.println("..............");
        Animal a2 = new Panthera();
        a2.move();
        a2.makeSound();
    }
}