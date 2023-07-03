package mult_thread.concurrent.pool;

import java.util.concurrent.Callable;

public class T_Call {
    public static void main(String[] args) throws Exception {
        Callable<String> call = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "123";
            }
        };
        String s = call.call();
        System.out.println(s);
    }
}
