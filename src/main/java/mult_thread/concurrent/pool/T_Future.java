package mult_thread.concurrent.pool;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class T_Future {
    public static void main(String[] args) throws Exception {
        Callable<String> call = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "123";
            }
        };
    }
}
