package myJava.basic.thread.safety.counter;

public class AsyncCounter {
    private int count = 0;

    public int getCount(){
        return count;
    }

    public void addCount(){
        count++;
    }
}
