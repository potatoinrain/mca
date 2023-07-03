package mult_thread.concurrent.example;

public class T_synchronized_notify {
    private Object lock = new Object();
    private static int count = 0;

    public synchronized void increase() {
        try {
            while(true){
                count++;
                System.out.println(Thread.currentThread().getName() + "| count=" + count);
                notifyAll();
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void reduce(){
        try {
            while(true){
                count--;
                System.out.println(Thread.currentThread().getName() + "| count=" + count);
                notifyAll();
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        T_synchronized_notify t = new T_synchronized_notify();

        new Thread(() ->{
            t.increase();
        }).start();
        new Thread(() ->{
            t.reduce();
        }).start();
    }
}
