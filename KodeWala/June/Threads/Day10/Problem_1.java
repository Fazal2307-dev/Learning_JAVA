class SharedResource {
    private boolean dataAvailable = false;

    // Producer thread ka kaam
    public synchronized void produce() {
        System.out.println("Producer: Data bana raha hoon...");
        dataAvailable = true;
        notify(); // waiting consumer ko signal
    }

    // Consumer thread ka kaam
    public synchronized void consume() {
        while (!dataAvailable) {
            try {
                System.out.println("Consumer: Data ka wait kar raha hoon...");
                wait(); // jab tak dataAvailable false hai, wait karo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer: Data consume kar liya!");
        dataAvailable = false;
    }
}

public class Problem_1{
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread consumerThread = new Thread(() -> {
            resource.consume();
        });

        Thread producerThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // thoda delay, taaki consumer wait kare
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.produce();
        });

        consumerThread.start();
        producerThread.start();
    }
}
