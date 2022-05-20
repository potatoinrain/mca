package mult_thread.I01_thread_start;

import java.util.concurrent.*;

//# 启动线程的5种方法
//
//1. new MyThread().start()
//2. new Thread(r).start()
//3. new Thread(lamda).start()
//4. ThreadPool
//5. Future Callable and FutureTask

public class I01_Thread_Start {

    public static void startThreadPool(){
        ExecutorService service = Executors.newFixedThreadPool(5);
        for(int i=0;i<10;i++){
            int finalI = i;
            service.execute(() ->{
                System.out.println(Thread.currentThread().getName());
//                while(true){
                    System.out.println("i:" + finalI);
//                }
            });
        }
        service.shutdown();
    }

    static class Mycall implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName());
            return "return callable1";
        }
    }

    public static void main(String[] args) throws Exception {
//        startThreadPool();

        ExecutorService service = Executors.newFixedThreadPool(5);
//        service.submit(new Mycall());

//        Future<String> tasks = service.submit(new Mycall());
//        System.out.println("main sleep 3000");
////        Thread.sleep(3000);
//        System.out.println("tasks get start");
//        String callResult = tasks.get();
//        System.out.println("tasks get end");
//        System.out.println(callResult);
//        service.shutdown();

        FutureTask<String> futureTask = new FutureTask<>(new Mycall());

//        Thread t = new Thread(futureTask);
//        t.start();
        System.out.println("main sleep 3000");
//        Thread.sleep(3000);
        System.out.println("tasks get start");
        String callResult = futureTask.get();
        System.out.println("tasks get end");
        System.out.println(callResult);

    }
}
