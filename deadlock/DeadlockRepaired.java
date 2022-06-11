package threads.deadlock;

public class DeadlockRepaired {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        DeadlockThreadOne threadOne = new DeadlockThreadOne();
        DeadlockThreadTwo threadTwo = new DeadlockThreadTwo();
        threadOne.start();
        threadTwo.start();
    }

    private static class DeadlockThreadOne extends Thread {
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("DeadlockThreadOne is holding LOCK 1...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("DeadlockThreadOne is waiting for Lock 2...");
                synchronized (lock2) {
                    System.out.println("DeadlockThreadOne  is holding Lock 1 and Lock 2...");
                }
            }
        }
    }

    private static class DeadlockThreadTwo extends Thread {
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("DeadlockThreadTwo is holding LOCK 1...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("DeadlockThreadTwo is waiting for Lock 2...");
                synchronized (lock2) {
                    System.out.println("DeadlockThreadTwo  is holding Lock 1 and Lock 2...");
                }
            }
        }
    }
}
