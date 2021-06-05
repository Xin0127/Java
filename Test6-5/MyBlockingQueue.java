package lesson4;

public class MyBlockingQueue<E> {

    private Object[] elements;//循环数组的方式
    private int putIndex;//存放元素的索引
    private int takeIndex;//取元素的索引
    private int size;//存放的元素数量

    public MyBlockingQueue(int capacity){//容量
        elements = new Object[capacity];
    }
    //存放元素
    public synchronized void put(E e){
        try {
            while(size==elements.length)
                wait();
            elements[putIndex] = e;
            size++;
            //循环数组的方式，存取的索引需要考虑超过数组长度的情况
            putIndex = (putIndex+1) % elements.length;
            notifyAll();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    //取元素
    public synchronized E take(){
        try {
            while (size == 0) wait();
            E e = (E) elements[takeIndex];
            size--;
            takeIndex = (takeIndex+1) % elements.length;
            notifyAll();
            return e;
        } catch (InterruptedException ie) {
            ie.printStackTrace();
            throw new RuntimeException("被中断了", ie);
        }
    }

    public static void main(String[] args) {
        MyBlockingQueue<Integer> queue = new MyBlockingQueue<>(10);
        //生产者存放元素
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while(true) {
                            queue.put(3);
                            System.out.println("生产了3个面包");
                            Thread.sleep(300);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        //消费者取元素
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while(true) {
                            Integer n = queue.take();
                            System.out.println("消费了" + n + "个面包");
                            Thread.sleep(300);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
