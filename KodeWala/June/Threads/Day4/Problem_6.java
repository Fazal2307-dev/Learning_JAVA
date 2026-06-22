class DeliverySimulation extends Thread {
    String riderName;

    DeliverySimulation(String name) {
        this.riderName = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(riderName + " delivering order " + i);
            try {
                Thread.sleep(1000); // rider taking short break
            } catch (InterruptedException e) {
                System.out.println(riderName + " interrupted!");
            }
        }
        System.out.println(riderName + " finished deliveries!");
    }
}
public class Problem_6{
    public static void main(String[] args) {
        DeliverySimulation r1 = new DeliverySimulation("Rider‑A");
        DeliverySimulation r2 = new DeliverySimulation("Rider‑B");
        DeliverySimulation r3 = new DeliverySimulation("Rider‑C");

        r1.start();
        r2.start();
        r3.start();
    }
}
