package lesson6;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CallableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Callable：可获取程序执行结果的一个任务类
        Callable<String> c = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(2);
                return "ok";
            }
        };
        FutureTask<String> task = new FutureTask(c);
        new Thread(task).start();
        System.out.println(1);
        //当前线程阻塞等待task线程执行完毕，获取到执行结果，再往下执行
        System.out.println(task.get());//ok

        ExecutorService pool = Executors.newCachedThreadPool();
        pool.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
        pool.submit(new Runnable() {
            @Override
            public void run() {

            }
        });
        pool.submit(new Callable<String>() {

            @Override
            public String call() throws Exception {
                return null;
            }
        });

        Lock lock = new ReentrantLock();
        lock.lock();
        try{

        }finally {
            lock.unlock();
        }
    }
}
