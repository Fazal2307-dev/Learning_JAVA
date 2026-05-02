interface RideService {

    default void startRide() {
        log("Starting ride...");
        System.out.println("Ride started successfully!");
    }

    static void serviceInfo() {
        log("Ride service is available 24/7.");
    }

    private static void log(String message) {
        System.out.println("[log] " + message);
    }

    void calculateFare(double distance);
}
class CabRide implements RideService {

    @Override
    public void calculateFare(double distance) {
        double fare = distance * 15;
        System.out.println("Cab fare: ₹" + fare);
    }
}
class BikeRide implements RideService {

    @Override
    public void calculateFare(double distance) {
        double fare = distance * 8;
        System.out.println("Bike fare: ₹" + fare);
    }
}
public class RideApp {
    public static void main(String[] args) {

        RideService.serviceInfo();

        RideService cab = new CabRide();
        cab.calculateFare(10);
        cab.startRide();

        RideService bike = new BikeRide();
        bike.startRide();
        bike.calculateFare(5);
    }
}