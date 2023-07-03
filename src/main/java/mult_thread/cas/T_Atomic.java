package mult_thread.cas;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class T_Atomic {

    static AtomicInteger atomicInteger = new AtomicInteger(0);
    static void m(){
//        atomicInteger.incrementAndGet();

    }

    public static void main(String[] args) {
        System.out.println(atomicInteger.addAndGet(20));
        System.out.println(atomicInteger.addAndGet(20));
        System.out.println(atomicInteger.getAndAdd(30));
        System.out.println(atomicInteger.getAndAdd(30));
    }
    
}
