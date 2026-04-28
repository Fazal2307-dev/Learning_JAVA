interface Vehical {
    double getSpeed();
    double calculateFare();
}

class Car implements Vehical {
    private double distance;
    private double time;
    private final double RATE_PER_KM = 12;

    public Car(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }

    @Override
    public double getSpeed() {
        return distance / time;
    }

    @Override
    public double calculateFare() {
        return distance * RATE_PER_KM;
    }
}

class Bike implements Vehical {
    private double distance;
    private double time;
    private final double RATE_PER_KM = 8;

    public Bike(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }

    @Override
    public double getSpeed() {
        return distance / time;
    }

    @Override
    public double calculateFare() {
        return distance * RATE_PER_KM;
    }
}

class Driver {
    private String name;
    private Vehical vehical;

    public Driver(String name, Vehical vehical) {
        this.name = name;
        this.vehical = vehical;
    }

    public void showDetails() {
        System.out.println("Driver: " + name);
        System.out.println("Speed: " + vehical.getSpeed() + " km/h");
        System.out.println("Fare: ₹" + vehical.calculateFare());
    }
}

public class UberApp {
    public static void main(String[] args) {
        Vehical car = new Car(5.0, 2.0);
        Vehical bike = new Bike(12.0, 3.0);

        Driver d1 = new Driver("Fazal", car);
        Driver d2 = new Driver("Aman", bike);

        System.out.println("---- Car Trip ----");
        d1.showDetails();

        System.out.println("\n---- Bike Trip ----");
        d2.showDetails();
    }
}