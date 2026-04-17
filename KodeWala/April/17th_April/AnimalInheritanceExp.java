//Write a Java program to create a class called Animal with a method called
// makeSound(). Create a subclass called Cat that overrides the makeSound()
// method to bark

class Animal{
    void makeSound(){
        System.out.println("The animal make sound :");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("The Cat is  make sound  like meow meow:");
    }
}
public class AnimalInheritanceExp {
    public static void main(String args[]){
        Cat cat = new Cat();
        cat.makeSound();
    }
}