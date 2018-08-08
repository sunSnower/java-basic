package myJava.basic.thread.safety.deadLock;

import java.util.Date;

public class LockA implements Runnable{
    public void run() {
        try{
            System.out.println(new Date().toString() + "LockA开始执行");
            while(true){
                synchronized (DeadLock.obj1){
                    System.out.println(new Date().toString() + "LockA锁住obj1");
                    Thread.sleep(3000);
                    synchronized (DeadLock.obj2){
                        System.out.println(new Date().toString() + "LockA锁住obj2");
                        Thread.sleep(1000*60*60);
                    }
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
