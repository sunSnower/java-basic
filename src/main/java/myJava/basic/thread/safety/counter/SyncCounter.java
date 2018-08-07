package myJava.basic.thread.safety.counter;

public class SyncCounter {
    private int count = 0;

    public int getCount(){
        return count;
    }

    public synchronized void addCount(){
        count++;
    }
}
