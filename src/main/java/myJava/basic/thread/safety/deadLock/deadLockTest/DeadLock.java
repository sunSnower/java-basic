package myJava.basic.thread.safety.deadLock.deadLockTest;

import myJava.basic.thread.safety.deadLock.deadLockTest.LockA;
import myJava.basic.thread.safety.deadLock.deadLockTest.LockB;

public class DeadLock {
    public static String obj1 = "obj1";
    public static String obj2 = "obj2";

    public static void main(String[] args){
        LockA lockA = new LockA();
        new Thread(lockA).start();
        LockB lockB = new LockB();
        new Thread(lockB).start();
    }
}
