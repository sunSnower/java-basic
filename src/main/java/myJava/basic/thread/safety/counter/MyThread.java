package myJava.basic.thread.safety.counter;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable {
    private SyncCounter counter;
    private CountDownLatch countDownLatch;

    public MyThread(SyncCounter counter, CountDownLatch countDownLatch){
        this.counter = counter;
        this.countDownLatch = countDownLatch;
    }

    public void run() {
        for(int i = 0; i < 10000; i++){
            counter.addCount();
        }
        countDownLatch.countDown();
    }
}
