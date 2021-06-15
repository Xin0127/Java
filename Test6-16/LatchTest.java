package lesson7;

import java.util.concurrent.CountDownLatch;

public class LatchTest {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(10);
        for (int j = 0; j < 10; j++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(2);
                    }finally {
                        //线程执行完毕（不管是正常执行完，还是异常执行完，都颁发一个许可证）
                        latch.countDown();
                    }
                }
            }).start();
        }
        //等待10个线程，执行完，再往后执行
        latch.await();
        System.out.println(1);
    }
}
