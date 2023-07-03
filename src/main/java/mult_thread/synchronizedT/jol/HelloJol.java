//package mult_thread.synchronizedT.jol;
//
//import org.openjdk.jol.info.ClassLayout;
//
///**
// * @author yangyu
// * @date 2022年06月15日 11:38
// */
//public class HelloJol {
//
//    static class HelloJolA{
//        private int a;
//        private short b = 2;
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        Thread.sleep(10000);
//        HelloJolA o = new HelloJolA();
//        System.out.println(ClassLayout.parseInstance(o).toPrintable());
//        synchronized (o){
//            System.out.println(ClassLayout.parseInstance(o).toPrintable());
//        }
//    }
//
//}
