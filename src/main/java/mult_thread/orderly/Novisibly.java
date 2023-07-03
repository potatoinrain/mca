package mult_thread.orderly;

public class Novisibly {

    private static boolean ready = false;
    private static int num = 0;

    public static class RunningThread extends Thread{
        @Override
        public void run() {
            while(!ready){
                Thread.yield();
            }
            System.out.println(num);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        RunningThread rt = new RunningThread();
        rt.start();
        num = 42;
        ready = true;
        rt.join();
    }

}
