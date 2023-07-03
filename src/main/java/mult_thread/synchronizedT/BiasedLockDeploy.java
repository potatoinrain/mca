//package mult_thread.synchronizedT;
//
//import mult_thread.synchronizedT.jol.HelloJol;
//import org.openjdk.jol.info.ClassLayout;
//
///**
// * @author yangyu
// * @date 2022年06月23日 12:32
// */
//public class BiasedLockDeploy {
//
//    /**
//     * -XX:BiasedLockingStartupDelay=0 设置偏向锁启动时延
//     * @param args
//     * @throws InterruptedException
//     */
//    public static void main(String[] args) throws InterruptedException {
//        Thread.sleep(10000);
//        Object o = new Object();
//        System.out.println(ClassLayout.parseInstance(o).toPrintable());
////        synchronized (o) {
////            System.out.println(ClassLayout.parseInstance(o).toPrintable());
////        }
//        System.out.println(o);
//    }
//
//}
