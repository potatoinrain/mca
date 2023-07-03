package mult_thread.orderly;

import java.util.concurrent.CountDownLatch;

/**
 * @author yangyu
 * @date 2022年05月20日 18:09
 */
public class Orderly {

    static int a = 0;
    static int b = 0;
    static int x = 0;
    static int y = 0;

    //两线程各执行 同时被乱序 出现的情况
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100_0000; i++) {
            a = 0;
            b = 0;
            x = 0;
            y = 0;
            CountDownLatch countDownLatch = new CountDownLatch(2);
            Thread t1 = new Thread(() -> {
                a = 1;
                x = b;
                countDownLatch.countDown();
            });
            //无关联关系 防止happens-before生效
            Thread t2 = new Thread(() -> {
                b = 1;
                y = a;
                countDownLatch.countDown();
            });

            t1.start();
            t2.start();
            countDownLatch.await();
            System.out.println(i);
            if (x == 0 && y == 0) {
                System.out.println("第" + i + "次:" + "x=" + x + "|y=" + y);
                break;
            }

        }
    }

}
