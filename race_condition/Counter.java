package threads.race_condition;

public class Counter {
    private int counter;

    public int value() {
        return counter;
    }

    public Counter() {
        counter = 0;
    }

    public void inc() {
        counter++;
    }

    public void dec() {
        counter--;
    }
}
