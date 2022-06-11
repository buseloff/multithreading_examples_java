package threads.race_condition;

public class SynchronizedCounter {
    private int counter;

    public int value() { return counter; }

    public SynchronizedCounter() {
        counter = 0;
    }

    public synchronized void inc() {
        counter++;
    }

    public synchronized void dec() {
        counter--;
    }
}