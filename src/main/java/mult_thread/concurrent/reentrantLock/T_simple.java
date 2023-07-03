package mult_thread.concurrent.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class T_simple {

    public static void main(String[] args) {
        final Service service = new Service(true);  //改为false就为非公平锁了
        Runnable runnable = () -> {
            System.out.println("**线程： " + Thread.currentThread().getName()
                    +  " 运行了 " );
            service.serviceMethod();
        };

        Thread[] threadArray = new Thread[10];

        for (int i=0; i<10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i=0; i<10; i++) {
            threadArray[i].start();
        }
    }

    public static class Service {

        private ReentrantLock lock ;

        public Service(boolean isFair) {
            lock = new ReentrantLock();
        }

        public void serviceMethod() {
            try {
                lock.lock();
                System.out.println("ThreadName=" + Thread.currentThread().getName()
                        + " 获得锁定");
            } finally {
                lock.unlock();
            }
        }
    }

}
