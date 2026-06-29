class ReadWrite {
    private String message;
    private boolean hasMessage = false;

    // Writer method
    public synchronized void write(String msg) {
        while (hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        message = msg;
        hasMessage = true;
        System.out.println("Writer wrote: " + msg);

        notify();
    }

    // Reader method
    public synchronized void read() {
        while (!hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Reader read: " + message);

        hasMessage = false;
        notify();
    }
}

// Writer Thread
class Writing extends Thread {

    ReadWrite readWrite;

    Writing(ReadWrite readWrite) {
        this.readWrite = readWrite;
    }

    @Override
    public void run() {
        String[] messages = {
                "Hello",
                "How are you?",
                "Java Multithreading",
                "wait() and notify()",
                "Bye"
        };

        for (String msg : messages) {
            readWrite.write(msg);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Reader Thread
class Reading extends Thread {

    ReadWrite readWrite;

    Reading(ReadWrite readWrite) {
        this.readWrite = readWrite;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            readWrite.read();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Driver class
public class Problem_5 {

    public static void main(String[] args) {

        ReadWrite rw = new ReadWrite();

        Writing writer = new Writing(rw);
        Reading reader = new Reading(rw);

        writer.start();
        reader.start();
    }
}