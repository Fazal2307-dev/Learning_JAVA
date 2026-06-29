class NumberPrinter {
    private int number = 1;
    private final int MAX = 10;

    public synchronized void printOdd() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
            } else {
                System.out.println("Odd: " + number++);
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 == 1) {
                try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
            } else {
                System.out.println("Even: " + number++);
                notify();
            }
        }
    }
}

public class Problem_3 {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();

        Thread oddThread = new Thread(np::printOdd);
        Thread evenThread = new Thread(np::printEven);

        oddThread.start();
        evenThread.start();
    }
}
