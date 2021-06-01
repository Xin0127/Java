package lesson3;

public class SynchronizedTest {

    private int count;

    public static void main(String[] args) {
        SynchronizedTest test = new SynchronizedTest();

        for (int i = 0; i < 10; i++) {
            final int k = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
//                    test.count++;
                    for (int j = 0; j < 1000; j++) {
                        //1.锁同一个对象：类对象
                        if(k==0) {
                            synchronized (SynchronizedTest.class) {
                                test.increment();
                            }
                        }else{
                            test.increment();
                        }
                    }
                }
            }).start();
        }

        //等待所有子线程执行完毕，再打印变量值
        while (Thread.activeCount()>1) Thread.yield();
        System.out.println(test.count);
    }
    private Object o = new Object();

    private void increment(){
//        synchronized (o) {
            count++;
//        }
    }
}
