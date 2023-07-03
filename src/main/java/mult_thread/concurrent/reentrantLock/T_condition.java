package mult_thread.concurrent.reentrantLock;

import javax.swing.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class T_condition {

    ReentrantLock lock = new ReentrantLock();
    public Condition produces = lock.newCondition();

    private void debugtest(){
        lock.lock();
    }

    public static void main(String[] args) {
        T_condition c = new T_condition();
        c.debugtest();
    }
}
