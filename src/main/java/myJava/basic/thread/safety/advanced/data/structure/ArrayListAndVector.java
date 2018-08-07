package myJava.basic.thread.safety.advanced.data.structure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/**
 * ArrayList, LinkedList是非线程安全的
 * Vector是线程安全的
 */
public class ArrayListAndVector {
    /**
     * 测试ArrayList是否为线程安全
     */
    public static void testLinkedList(){
        List<Object> list = new LinkedList<Object>();
        int threadCount = 10000;
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        for(int i = 0; i < threadCount; i++){
            Thread thread = new Thread(new MyThread(list, countDownLatch));
            thread.start();
        }

        try{
            countDownLatch.await();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("** : " + list.size());
    }

    /**
     * 测试Vector是否为线程安全
     */
    public static void testVector(){
        List<Object> list = new Vector<Object>();
        int threadCount = 10000;
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        for(int i = 0; i < threadCount; i++){
            Thread thread = new Thread(new MyThread(list, countDownLatch));
            thread.start();
        }

        try{
            countDownLatch.await();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("** : " + list.size());
    }

    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            //testLinkedList();
            testVector();
        }
    }
}
