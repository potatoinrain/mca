package mult_thread.concurrent.tool;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class T_CyccleBarrier {

    /**
     * simple测试
     * @param args
     */
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(10, ()-> {
            System.out.println("开车");
        });


        for(int i=0;i<10;i++){
            new Thread(()->{
                while (true){
                    try {
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName() + "| await");
                        barrier.await();
                        System.out.println(Thread.currentThread().getName() + "| do");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        System.out.println("end");


    }
}
