package lesson4;

/**
 * 面包店：
 * 10个消费者，不停的消费，每个每次消费1个
 * 5个生产者，不停的生产，每个每次生产3个
 * 库存上限100
 */
public class BreadShop {

    //库存数
    private static int COUNT;

    public static void main(String[] args) {
        //消费者线程
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true){//不停的消费
                            //消费者之间，消费者和生产者之间，都使用库存(共享变量)
                            synchronized (BreadShop.class){//同一个对象保证线程安全
                                while(COUNT==0) BreadShop.class.wait();
                                COUNT--;
                                System.out.println(Thread.currentThread().getName()+"消费，库存："+COUNT);
                                BreadShop.class.notifyAll();
                            }
                            Thread.sleep(300);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, "消费者["+i+"]").start();
        }

        //生产者线程
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true){//不停的生产
                            //消费者之间，消费者和生产者之间，都使用库存(共享变量)
                            synchronized (BreadShop.class){//同一个对象保证线程安全
                                while(COUNT+3>100) BreadShop.class.wait();
                                COUNT+=3;
                                System.out.println(Thread.currentThread().getName()+"生产，库存："+COUNT);
                                BreadShop.class.notifyAll();
                            }
                            Thread.sleep(300);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, "生产者["+i+"]").start();
        }
    }
}
