class Cooking extends Thread{
    @Override
    public void run() {
        System.out.println("Food is being preparad....["+Thread.currentThread().getName() + "]");
        try {
            sleep(6000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Food preparation is Done....["+Thread.currentThread().getName() + "]");

    }
}

public class Problem_1 {

    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setName("waiter");
        System.out.println("waiter took the order....["+Thread.currentThread().getName() + "]");

        Cooking t1 = new Cooking();
        t1.setName("cook");
        t1.start();

        t1.join(1000);//waiter thread will here till food is cooked
        System.out.println("waiter started serving order..["+Thread.currentThread().getName() + "]");


    }

}