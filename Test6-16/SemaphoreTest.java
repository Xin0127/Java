package lesson7;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(0);
        for (int j = 0; j < 10; j++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(2);
                    }finally {
                        //线程执行完毕（不管是正常执行完，还是异常执行完，都颁发一个许可证）
                        semaphore.release();
                    }
                }
            }).start();
        }
        //等待10个线程，执行完，再往后执行
        semaphore.acquire(10);//当前线程等待，直到获取到10个许可证
        System.out.println(1);
    }
}
