class ABPrinter {

    private boolean printA = true;

    public synchronized void printA() {

        for (int i = 0; i < 5; i++) {

            while (!printA) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("A");

            printA = false;

            notify();
        }
    }

    public synchronized void printB() {

        for (int i = 0; i < 5; i++) {

            while (printA) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("B");

            printA = true;

            notify();
        }
    }
}

// Thread to print A
class PrintAThread extends Thread {

    private ABPrinter printer;

    public PrintAThread(ABPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printA();
    }
}

// Thread to print B
class PrintBThread extends Thread {

    private ABPrinter printer;

    public PrintBThread(ABPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printB();
    }
}

// Driver class
public class Problem_6 {

    public static void main(String[] args) {

        ABPrinter printer = new ABPrinter();

        PrintAThread t1 = new PrintAThread(printer);
        PrintBThread t2 = new PrintBThread(printer);
        t1.setName("A");
        t2.setName("B");
        t1.start();
        t2.start();
    }
}