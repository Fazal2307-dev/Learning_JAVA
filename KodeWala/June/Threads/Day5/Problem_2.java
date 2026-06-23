

class EvenOddPrinter {
    // synchronized method → ek time pe sirf ek thread chalega
    public synchronized void printNumbers(boolean isEven) {
        if (isEven) {
            System.out.println("EvenThread.run()....START... :" + Thread.currentThread().getName());
            for (int i = 1; i < 20; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even no from input.... :" + i + " " + Thread.currentThread().getName());
//                    if (i == 10) {
//                        try {
//                            Thread.sleep(5000);
//                            System.out.println("Waiting time 5 sec so wait");
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
                }
            }
            System.out.println("EvenThread.run()....END... :" + Thread.currentThread().getName());
        } else {
            System.out.println("OddThread.run()....START... :" + Thread.currentThread().getName());
            for (int i = 1; i < 20; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd no from input.... :" + i + " " + Thread.currentThread().getName());
//                    if (i == 10) {
//                        try {
//                            Thread.sleep(5000);
//                            System.out.println("Waiting time 5 sec so wait");
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
                }
            }
            System.out.println("OddThread.run()....END... :" + Thread.currentThread().getName());
        }
    }
}

class EvenOddThread extends Thread {
    private boolean isEven;
    private EvenOddPrinter printer;

    public EvenOddThread(boolean isEven, EvenOddPrinter printer) {
        this.isEven = isEven;
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printNumbers(isEven);  // synchronized method call
    }
}

public class Problem_2 {
    public static void main(String[] args) {
        EvenOddPrinter printer = new EvenOddPrinter();

        EvenOddThread t1 = new EvenOddThread(true, printer);   // Even thread
        EvenOddThread t2 = new EvenOddThread(false, printer);  // Odd thread

        t1.setName("Thread-Even");
        t2.setName("Thread-Odd");

        t1.start();
        t2.start();
    }
}
