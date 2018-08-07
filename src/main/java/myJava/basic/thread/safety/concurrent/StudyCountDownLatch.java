package myJava.basic.thread.safety.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * 存在于java.util.concurrent包下
 * CountDownLatch是一个同步工具类，允许一个或多个线程一直等待，直到其他线程的操作执行完再执行
 *
 * 原理：CountDownLathc是通过一个计数器来实现的，计数器的初始值为线程的数量。每当一个线程完成了
 * 自己的任务后，计数器的值减一。当计数器值到达0时，它表示所有的县城已经完成了任务，然后在等待的线程就可以恢复执行任务
 *
 * 工作过程：构造器中的计数值实际上就是闭锁需要等待的线程数量，这个值只能被设置一次
 * 与CountDownLatch的第一次交互是主线程等待其他线程。主线程必须在启动其他线程后立即调用CountDownLatch.await()方法
 * 这样主线程的操作就会在这个方法上阻塞，直到其他线程完成各自的任务
 * 其他N个线程必须引用闭锁对象，因为他们需要通知CountDownLatch对象，他们已经完成了各自的任务。
 * 这种通知机制是通过CountDownLatch.countDown()方法来完成的，每调用一次这个方法，在构造函数中
 * 初始化的count值就-1.count==0,然后主线程就通知await()方法，恢复执行自己的任务。
 */
public class StudyCountDownLatch extends CountDownLatch {

    public StudyCountDownLatch(int count) {
        super(count);
    }

    @Override
    public void await() throws InterruptedException {
        super.await();
    }

    @Override
    public boolean await(long timeout, TimeUnit unit) throws InterruptedException {
        return super.await(timeout, unit);
    }

    @Override
    public void countDown() {
        super.countDown();
    }

    @Override
    public long getCount() {
        return super.getCount();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
