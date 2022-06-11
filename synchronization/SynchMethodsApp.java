package threads.synchronization;

public class SynchMethodsApp {
    public static void main(String[] args) {
        SynchMethodsApp e1 = new SynchMethodsApp();
        SynchMethodsApp e2 = new SynchMethodsApp();
        new Thread(() -> e1.method1()).start();
        new Thread(() -> e2.method1()).start();
        new Thread(() -> e1.method2()).start();
        new Thread(() -> e2.method2()).start();
        new Thread(() -> e1.method3()).start();
        new Thread(() -> e2.method3()).start();
    }

    public synchronized void method1() {
        System.out.println("Method1-START");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Method1-END");
    }

    public synchronized void method2() {
        System.out.println("Method2-START");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Method2-END");
    }

    public void method3() {
        System.out.println("Method3-START");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Method3-END");
    }
}
