import java.util.LinkedList;
import java.util.Queue;

class ProducerConsumer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == LIMIT) {
            System.out.println("Producer waiting, queue full...");
            wait();
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notifyAll(); // notify consumers
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Consumer waiting, queue empty...");
            wait();
        }
        int val = queue.poll();
        System.out.println("Consumed: " + val);
        notifyAll(); // notify producers
    }
}

public class Problem_2 {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    pc.produce(i);
                    Thread.sleep(500);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    pc.consume();
                    Thread.sleep(1000);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        producer.start();
        consumer.start();
    }
}
