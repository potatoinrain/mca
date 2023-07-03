package mult_thread.concurrent.tool;

public class T_ThreadLocal {

    static ThreadLocal<Object> tl = new ThreadLocal();

    public static void main(String[] args) {
        tl.get();
        tl.set(new Object());
    }
}
