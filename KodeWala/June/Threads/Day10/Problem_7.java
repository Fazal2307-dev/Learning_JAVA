class SharedResource {
    public synchronized void consume() {
        System.out.println(Thread.currentThread().getName() + " waiting...");
        try {
            wait(); // thread goes into waiting state
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " resumed!");
    }

    public synchronized void notifyOne() {
        System.out.println("Producer calling notify()");
        notify(); // wakes up only ONE waiting thread
    }

    public synchronized void notifyAllThreads() {
        System.out.println("Producer calling notifyAll()");
        notifyAll(); // wakes up ALL waiting threads
    }
}

public class Problem_7 {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        // 3 consumer threads waiting
        Thread c1 = new Thread(resource::consume, "Consumer-1");
        Thread c2 = new Thread(resource::consume, "Consumer-2");
        Thread c3 = new Thread(resource::consume, "Consumer-3");

        c1.start();
        c2.start();
        c3.start();

        Thread.sleep(2000); // give time for consumers to start waiting

        // Try notify() → only one consumer wakes up
        resource.notifyOne();

        Thread.sleep(2000);

        // Try notifyAll() → all remaining consumers wake up
        resource.notifyAllThreads();
    }
}
