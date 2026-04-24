//11.Write a Java program to create a base class Vehicle with methods startEngine() and
// stopEngine(). Create two subclasses Car and Motorcycle. Override the startEngine()
// and stopEngine() methods in each subclass to start and stop the engines differently.
class Vehical{
    void startEngine(){
        System.out.println("Vehical.startEngine(Start the engine)");
    }
    void stopEngine(){
        System.out.println("Vehical.stopEngine(stop the engine)");
    }
}
class Car extends Vehical{
    @Override
    void startEngine(){
        System.out.println("Car.startEngine(Start the engine)");
    }
    void stopEngine(){
        System.out.println("Car.stopEngine(stop the engine)");
    }
}
class Motorcycle extends Vehical{
    @Override
    void startEngine(){
        System.out.println("Motorcycle.startEngine(Start the engine)");
    }
    void stopEngine(){
        System.out.println("Motorcycle.stopEngine(stop the engine)");
    }
}
public  class Vehical_Car_Motorcycle {
    public static void main(String args[]){
    Vehical v1 = new Car();
    v1.startEngine();
    v1.stopEngine();
    System.out.println("........");
    Vehical v2 = new Motorcycle();
    v2.startEngine();
    v2.stopEngine();
    }
}