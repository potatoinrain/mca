package mult_thread.volatile1;

/**
 * 并发可见性导致 线程结束 失败
 */
public class HeloVolatile {

    private static boolean runable = true;

    private static void r(){
        System.out.println("r start");
        while(runable){
//            System.out.println(2);
        }
        System.out.println("r end");

    }

    public static void main(String[] args) throws InterruptedException {
        HeloVolatile heloVolatile = new HeloVolatile();
        new Thread(HeloVolatile::r, "t1").start();

        Thread.sleep(1000);
        runable = false;


    }
    
}
