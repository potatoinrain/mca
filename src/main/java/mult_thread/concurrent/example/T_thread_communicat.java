package mult_thread.concurrent.example;


import java.util.ArrayList;
import java.util.List;

/**
 * 一道面试题：实现一个容器，提供两个方法，add,size
 * 写两个线程，线程1添加10个元素到容器中，
 * 线程2实现监控元素的个数，当个数到5个时，线程2给出提示并结束线程2C]
 */
public class T_thread_communicat {
    private Object lock = new Object();

    List list = new ArrayList();

    public void add(Object o) {
        list.add(o);
    }

    public int size() {
        return list.size();
    }

    /**
     * sync wait notify实现
     *
     * @param
     */
    public void syncCommunicat() {

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    if (i == 5) {
                        try {
                            lock.notify();
                            System.out.println("t1 wait");
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("t1 add " + i);
                    add(new Object());
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                if(size() != 5){
                    try {
                        System.out.println("t2 wait");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("t2 break");
                lock.notify();
            }
        });

        t1.start();
        t2.start();
    }

    /**
     * CountDownlatch 实现
     * 使用两个latch分别阻塞
     * @param
     */

    /**
     * locksupport 实现
     * 分别阻塞
     * @param
     */


    public static void main(String[] args) {
        T_thread_communicat t = new T_thread_communicat();
        t.syncCommunicat();
    }


}
