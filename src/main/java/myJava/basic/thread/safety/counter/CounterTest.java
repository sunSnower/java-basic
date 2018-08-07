package myJava.basic.thread.safety.counter;

import java.util.concurrent.CountDownLatch;

public class CounterTest{
    public static void test(){
        SyncCounter counter = new SyncCounter();
        int threadCount = 100;
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);

        for(int i = 0; i < threadCount; i++){
            Thread thread = new Thread(new MyThread(counter, countDownLatch));
            thread.start();
        }

        try{
            countDownLatch.await();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(counter.getCount());
    }

    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            test();
        }
    }
}
