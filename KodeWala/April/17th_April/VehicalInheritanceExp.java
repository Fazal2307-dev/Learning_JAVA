//2. Write a Java program to create a class called Vehicle with a method called
// drive(). Create a subclass called Car that overrides the drive() method to print
// "Repairing a car".

class Vehical{
    void drive(){
        System.out.println("Repairing a Vehical :");
    }
}
class Car extends Vehical{
    void drive(){
        System.out.println("Repairing a Car :");
    }
}
public class VehicalInheritanceExp{
    public static void main(String[] args){
        Car car = new Car();
        car.drive();
    }
}