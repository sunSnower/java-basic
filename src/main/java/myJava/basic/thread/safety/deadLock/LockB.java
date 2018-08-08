package myJava.basic.thread.safety.deadLock;

import java.util.Date;

public class LockB implements Runnable {
    public void run() {
        try{
            System.out.println(new Date().toString() + "LockB开始执行");
            while(true){
                synchronized (DeadLock.obj2){
                    System.out.println(new Date().toString() + "LockB锁住obj2");
                    Thread.sleep(3000);
                    synchronized (DeadLock.obj1){
                        System.out.println(new Date().toString() + "");
                    }
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
