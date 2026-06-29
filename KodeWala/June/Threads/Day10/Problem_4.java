class PingPong {
    private boolean pingTurn = true;

    public synchronized void ping() {
        for (int i = 0; i < 5; i++) {
            while (!pingTurn) {
                try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
            }
            System.out.println("Ping");
            pingTurn = false;
            notify();
        }
    }

    public synchronized void pong() {
        for (int i = 0; i < 5; i++) {
            while (pingTurn) {
                try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
            }
            System.out.println("Pong");
            pingTurn = true;
            notify();
        }
    }
}

public class Problem_4 {
    public static void main(String[] args) {
        PingPong pp = new PingPong();

        Thread t1 = new Thread(pp::ping);
        Thread t2 = new Thread(pp::pong);

        t1.start();
        t2.start();
    }
}
