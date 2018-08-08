package myJava.basic.thread.safety.deadLock.solveDeadLock;

import com.sun.xml.internal.ws.spi.db.DatabindingException;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class LockC implements Runnable{

    public void run() {
        try{
            System.out.println(new Date().toString() + "LockC开始执行");
            while(true){
                if(UnLockTest.a1.tryAcquire(1, TimeUnit.SECONDS)){
                    System.out.println(new Date().toString() + "LockC锁住obj1");
                    if(UnLockTest.a2.tryAcquire(1, TimeUnit.SECONDS)){
                        System.out.println(new Date().toString() + "LockC锁住obj2");
                        Thread.sleep(60*1000);
                    }
                    else{
                        System.out.println(new Date().toString() + "LockC锁obj2失败");
                    }
                }
                else{
                    System.out.println(new Date().toString() + "LockC锁obj1失败");
                }
                UnLockTest.a1.release();
                UnLockTest.a2.release();
                Thread.sleep(1000);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
