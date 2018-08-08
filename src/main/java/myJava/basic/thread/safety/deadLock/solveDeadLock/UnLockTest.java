package myJava.basic.thread.safety.deadLock.solveDeadLock;

import java.util.concurrent.Semaphore;

public class UnLockTest {
    public static String obj1 = "obj1";
    public static final Semaphore a1 = new Semaphore(1);
    public static String obj2 = "obj2";
    public static final Semaphore a2 = new Semaphore(1);

    public static void main(String[] args){
        LockC lockC = new LockC();
        new Thread(lockC).start();
        LockD lockD = new LockD();
        new Thread(lockD).start();
    }
}
