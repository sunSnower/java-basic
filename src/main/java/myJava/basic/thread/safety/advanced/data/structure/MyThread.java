package myJava.basic.thread.safety.advanced.data.structure;

import java.util.List;
import java.util.concurrent.CountDownLatch;

class MyThread implements Runnable{
    private List<Object> list;
    private CountDownLatch countDownLatch;

    public MyThread(List<Object> list, CountDownLatch countDownLatch){
        this.list = list;
        this.countDownLatch = countDownLatch;
    }

    public void run() {
        for(int i = 0; i < 100; i++){
            list.add(new Object());
        }
        countDownLatch.countDown();
    }
}
