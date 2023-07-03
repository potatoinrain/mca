package mult_thread.concurrent.tool;

import java.util.concurrent.CountDownLatch;

public class T_CountDownLatch1 {

    /**
     * 一个线程countdown不停次数
     */
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(10);
        new Thread(()-> {
            while (true){
                try {
                    Thread.sleep(500);
                    latch.countDown();
                    System.out.println(Thread.currentThread().getName() + "| countdown");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        latch.await();
        System.out.println("end");
    }

}
