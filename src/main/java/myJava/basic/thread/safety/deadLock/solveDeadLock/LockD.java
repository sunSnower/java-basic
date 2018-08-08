package myJava.basic.thread.safety.deadLock.solveDeadLock;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class LockD implements Runnable{
    public void run() {
        try{
            System.out.println(new Date().toString() + "LockD开始执行");
            while(true){
                if(UnLockTest.a2.tryAcquire(1, TimeUnit.SECONDS)){
                    System.out.println(new Date().toString() + "LockD锁住obj2");
                    if(UnLockTest.a1.tryAcquire(1, TimeUnit.SECONDS)){
                        System.out.println(new Date().toString() + "LockD锁住obj1");
                        Thread.sleep(60*1000);
                    }
                    else{
                        System.out.println(new Date().toString() + "LockD锁obj1失败");
                    }
                }
                else{
                    System.out.println(new Date().toString() + "LockD锁obj2失败");
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
