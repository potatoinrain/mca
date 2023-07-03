package mult_thread.concurrent.tool;

import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class T_LockSupport {

    public static void main(String[] args) {
//        Thread t1 = new Thread();
//        LockSupport.unpark(t1);
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
    }

}
