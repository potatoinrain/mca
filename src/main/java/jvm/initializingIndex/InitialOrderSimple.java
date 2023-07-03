package jvm.initializingIndex;

public class InitialOrderSimple {
    static SampleClass sam = new SampleClass("静态成员sam初始化");
    static {
        System.out.println("static块执行");
        if (sam == null)
            System.out.println("sam is null");
        sam = new SampleClass("静态块内初始化sam成员变量");
    }
}