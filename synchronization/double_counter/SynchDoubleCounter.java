package threads.synchronization.double_counter;

public class SynchDoubleCounter {
    private long counter1 = 0;
    private long counter2 = 0;

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public long value1() { return counter1; }

    public long value2() { return counter2; }

    public void inc1() {
        synchronized (lock1) {
            counter1++;
        }
    }

    public void inc2() {
        synchronized (lock2) {
            counter2++;
        }
    }

    public void dec1() {
        synchronized (lock1) {
            counter1--;
        }
    }

    public void dec2() {
        synchronized (lock2) {
            counter2--;
        }
    }
}
