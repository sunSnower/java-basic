package myJava.basic.threadPool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;
import java.util.logging.Handler;

public class ThreadPool {

    public static void threadPoolTest(){
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 100, 100L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
        threadPoolExecutor.execute(() -> System.out.println(Thread.currentThread().getName()));
        threadPoolExecutor.shutdown();
    }
    public static void main(String[] args){
        threadPoolTest();
    }

}
