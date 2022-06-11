package threads.race_condition;

public class SynchronizedCounterApp {
    public static void main(String[] args) {
        SynchronizedCounter synchCounter = new SynchronizedCounter();

        Thread incThread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                synchCounter.inc();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread decThread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                synchCounter.dec();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        try {
            incThread.start();
            decThread.start();
            incThread.join();
            decThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Synchronized value = " + synchCounter.value());
    }
}
