package threads.synchronization;

public class ChairsApp {
    public static void main(String[] args) throws Exception {
        Object chair1 = new Object();
        Object chair2 = new Object();

        Thread man1 = new Thread(() -> {
            System.out.println("Чел1 подошел к стулу1");
            synchronized (chair1) {
                System.out.println("Чел1 сел на стул1");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Чел1 встал со стула1");
            }
        });
        man1.start();

        Thread man2 = new Thread(() -> {
            System.out.println("Чел2 подошел к стулу1");
            synchronized (chair1) {
                System.out.println("Чел2 сел на стул1");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Чел2 встал со стула1");
            }
        });
        man2.start();

        Thread man3 = new Thread(() -> {
            System.out.println("Чел3 подошел к стулу1");
            synchronized (chair1) {
                System.out.println("Чел3 сел на стул1");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Чел3 встал со стула1");
            }
        });
        man3.start();

        Thread man4 = new Thread(() -> {
            System.out.println("Чел4 подошел к стулу2");
            synchronized (chair2) {
                System.out.println("Чел4 сел на стул2");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Чел4 встал со стула2");
            }
        });
        man4.start();
    }
}
