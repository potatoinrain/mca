package mult_thread.concurrent.tool;

public class M {

    public int i = 0;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
    }
}
