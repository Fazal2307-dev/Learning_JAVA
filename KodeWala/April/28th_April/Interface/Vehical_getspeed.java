//Create an interface Vehicle:method: double getSpeed()Create classes:
//Car → speed = distance/time:Bike → speed = distance/time
//In main:create objects using interface reference print speed
interface Vehical{
    public abstract double getSpeed();
}
class Car implements Vehical{

    private double time;
    private double distance;
    public Car(double distance,double time){
        this.distance=distance;

        this.time = time;
    }
    @Override
    public double getSpeed(){
       double  speed = distance / time;
        return speed;
    }
}
class Bike implements Vehical{

    private double time;
    private double distance;
    public Bike(double distance,double time){
        this.distance=distance;

        this.time = time;
    }
    @Override
    public double getSpeed(){
       double  speed = distance / time;
        return speed;
    }
}
public class Vehical_getspeed {
    public static void main(String[] args){
        Vehical c1 = new Car(5.0,2.0);
        System.out.println("Car Speed :"+c1.getSpeed());
        Vehical B1 = new Bike(5.0,2.0);
        System.out.println("Bike Speed :"+B1.getSpeed());
    }
}